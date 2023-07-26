package hw3.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenerateTranscript {
    //Next week homework
    public static void takeInputFromUser(Scanner scanner, Transcript transcript) {
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()

        // Continue taking inputs until the user enters the endoffile indicator
        while (true) {
            System.out.println("Enter Department:");
            String department = scanner.nextLine();

            if (department.equals("endoffile")) {
                break;
            }

            System.out.println("Enter Course Code:");
            int courseCode = scanner.nextInt();

            System.out.println("Enter Credit:");
            int courseCredit = scanner.nextInt();

            System.out.println("Enter Grade:");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character left by nextDouble()

            CourseGrade courseGrade = new CourseGrade(department, courseCode, courseCredit);
            courseGrade.setGradeTaken(grade);
            courseGrade.setCourseCode(courseCode);
            courseGrade.setCourseCredit(courseCredit);
            transcript.addCourseTaken(courseGrade);
        }

        // Update the student ID
        transcript.setStudentId(studentId);
    }


    public static void takeInputFromFile(Scanner scanner, Transcript transcript) {
        System.out.println("Enter filename:");
        String fileName = scanner.next();

        try {
            File file = new File(fileName);
            scanner = new Scanner(file);

            if (scanner.hasNextInt()) {
                int studentId = scanner.nextInt();
                transcript.setStudentId(studentId);
            }

            // Continue taking inputs until the end of the file
            while (scanner.hasNext()) {
                String department = scanner.next();
                int courseCode = scanner.nextInt();
                int credit = scanner.nextInt();
                double grade = scanner.nextDouble();

                CourseGrade courseGrade = new CourseGrade(department, courseCode, credit);
                courseGrade.setGradeTaken(grade);
                transcript.addCourseTaken(courseGrade);
            }

            System.out.println("Transcript generated from the file successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Exiting the program.");
        }
    }
}
