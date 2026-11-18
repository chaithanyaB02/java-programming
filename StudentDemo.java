import java.util.Scanner;

class Students {
    String usn;
    String name;
    String branch;
    String phone;

    // Method to read student details
    void readDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
    }

    // Method to display student details
    void displayDetails() {
        System.out.printf("%-15s %-20s %-15s %-15s\n", usn, name, branch, phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students (N): ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        // Create an array of N Student objects
        Students[] Student = new Students[n];

        // Read details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            Student[i] = new Students();
            Student[i].readDetails(sc);
        }

        // Print suitable headings and student details
        System.out.println("\n-------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-15s %-15s\n", "USN", "Name", "Branch", "Phone");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            Student[i].displayDetails();
        }

        sc.close();
    }
}
