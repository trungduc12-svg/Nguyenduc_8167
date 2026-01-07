package nguyenduc_8167;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hoVaTen;
        int studentID;
        String hometown;
        float gpa;
        String major;
        boolean scholarship;

        System.out.print("Enter full name: ");
        hoVaTen = sc.nextLine();

        System.out.print("Enter student ID: ");
        studentID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter hometown: ");
        hometown = sc.nextLine();

        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter major: ");
        major = sc.nextLine();

        System.out.print("Enter scholarship (true/false): ");
        scholarship = sc.nextBoolean();
        sc.nextLine();

        System.out.println("\n--- STUDENT INFORMATION ---");
        System.out.println("Full name: " + hoVaTen);
        System.out.println("Student ID: " + studentID);
        System.out.println("Hometown: " + hometown);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Scholarship: " + scholarship);
    }
}
