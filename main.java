// Main.java
import java.util.ArrayList;
import java.util.List;

// 1. Parent Class: Person
class person {
    // Encapsulation: private fields
    private String name;
    private int age;

    // Static field to keep track of total people created
    private static int totalPeopleCount = 0;

    // Final constant for institutional value
    public static final String INSTITUTION_NAME = "Global Tech University";

    // Constructor using super() implicitly or explicitly
    public person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPeopleCount++; // Increment static counter
    }

    // Getters for controlled access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getTotalPeopleCount() {
        return totalPeopleCount;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Institution: " + INSTITUTION_NAME);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded Method Requirement
    public void displayDetails(boolean includeHeader) {
        if (includeHeader) {
            System.out.println("--- PERSON PROFILE ---");
        }
        displayDetails();
    }
}

// 2. Subclass: Student
class student extends person {
    private String studentId;
    private String major;

    public student(String name, int age, String studentId, String major) {
        super(name, age); // Invoking parent constructor
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Reusing parent logic
        System.out.println("Role: Student");
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

// 3. Subclass: Faculty
class Faculty extends person {
    private String employeeId;
    private Department department; // Composition with nested class

    // Nested Class Requirement
    public static class Department {
        private String deptName;
        private String blockCode;

        public Department(String deptName, String blockCode) {
            this.deptName = deptName;
            this.blockCode = blockCode;
        }

        @Override
        public String toString() {
            return deptName + " (Block: " + blockCode + ")";
        }
    }

    public Faculty(String name, int age, String employeeId, Department department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Faculty");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

// 4. Subclass: Administrator
class Administrator extends person {
    private String roleTitle;

    public Administrator(String name, int age, String roleTitle) {
        super(name, age);
        this.roleTitle = roleTitle;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Administrator");
        System.out.println("Title: " + roleTitle);
    }
}

// Execution Driver
public class main {
    public static void main(String[] args) {
        // Instantiate nested department configuration
        Faculty.Department csDept = new Faculty.Department("Computer Science", "Tech-B");

        // Storing subclass objects inside a Person[] array
        person[] directory = new person[3];
        directory[0] = new student("Alice Johnson", 20, "S101", "Data Science");
        directory[1] = new Faculty("Dr. Robert Smith", 45, "F204", csDept);
        directory[2] = new Administrator("Claire Danes", 38, "Registrar");

        System.out.println("=========================================");
        System.out.println("DEMONSTRATING RUN-TIME POLYMORPHISM");
        System.out.println("=========================================\n");

        // Demonstrate runtime polymorphism using displayDetails() loop
        for (person person : directory) {
            person.displayDetails();
            System.out.println("-----------------------------------------");
        }

        System.out.println("\n=========================================");
        System.out.println("DEMONSTRATING OVERLOADED METHOD");
        System.out.println("=========================================");
        directory[0].displayDetails(true);

        System.out.println("\n=========================================");
        System.out.println("METADATA STATS");
        System.out.println("=========================================");
        System.out.println("Total Person Instances Created: " + person.getTotalPeopleCount());
    }
}
