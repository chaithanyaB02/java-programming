
class Student {

    final int MAX_MARKS = 100;

    static int studentCount = 0;

    private String usn;
    private String name;
    private int marks1, marks2, marks3;

    Student(String usn, String name,
            int marks1, int marks2, int marks3) {

        this.usn = usn;
        this.name = name;

        this.marks1 = validateMarks(marks1);
        this.marks2 = validateMarks(marks2);
        this.marks3 = validateMarks(marks3);

        studentCount++;
    }

    private int validateMarks(int marks) {
        if (marks >= 0 && marks <= MAX_MARKS) {
            return marks;
        } else {
            System.out.println("Invalid marks! Setting to 0.");
            return 0;
        }
    }

    public String getUSN() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    public void display(boolean result) {
        if (result) {
            System.out.println("Marks 1: " + marks1);
            System.out.println("Marks 2: " + marks2);
            System.out.println("Marks 3: " + marks3);

            System.out.println("Total: " + calculateTotal());
            System.out.println("Average: " + calculateAverage());
        }
    }
    public Student getResultSummary() {
        return new Student(
                usn, name, marks1, marks2, marks3
        );
    }
    public static void main(String[] args) {

        Student s1 = new Student(
                "1AB23CS001", "Rahul", 85, 90, 80
        );

        Student s2 = new Student(
                "1AB23CS002", "Ananya", 75, 88, 92
        );

        System.out.println("STUDENT 1 DETAILS");
        s1.display();

        System.out.println("\nSTUDENT 1 RESULT");
        s1.display(true);

        System.out.println("\nSTUDENT 2 DETAILS");
        s2.display();

        System.out.println("\nSTUDENT 2 RESULT");
        s2.display(true);

        System.out.println("\nTotal Students: " +
                studentCount);

        Student summary = s1.getResultSummary();

        System.out.println("\nRESULT SUMMARY");
        summary.display();
        summary.display(true);
    }
}

