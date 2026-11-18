// Outer class
class University {
    private String uniName = "Global Tech University";

    // 1. Static nested class
    static class Department {
        private String deptName;

        public Department(String deptName) {
            this.deptName = deptName;
        }

        public void displayDepartment() {
            System.out.println("Department Name: " + deptName);
        }
    }

    // 2. Non-static inner class
    class Faculty {
        private String facultyName;
        private String designation;

        public Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        public void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName + ", Designation: " + designation);
        }
    }

    // 3. Outer-class method
    public void displayUniversityInfo() {
        System.out.println("University Name: " + uniName);
    }
}
public class unimain{
    public static void main(String[] args) {
        // Step 1: Create a University object
        University myUni = new University();

        // Step 2: Create a Department object without first creating a University object
        University.Department myDept = new University.Department("Computer Science");

        // Step 3: Create a Faculty object using the University object
        University.Faculty myFaculty = myUni.new Faculty("Dr. Smith", "Professor");

        // Step 4: Display all details
        System.out.println("--- University Details ---");
        myUni.displayUniversityInfo();
        myDept.displayDepartment();
        myFaculty.displayFaculty();
    }
}
