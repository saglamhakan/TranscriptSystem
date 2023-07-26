import hw3.main.CourseGrade;
import hw3.main.GenerateTranscript;
import hw3.main.Transcript;
import hw3.util.GradeType;

import java.util.Scanner;

import static hw3.main.GenerateTranscript.takeInputFromFile;
import static hw3.main.GenerateTranscript.takeInputFromUser;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transcript transcript = new Transcript(0); // Student ID will be updated later

        System.out.println("Choose an option:");
        System.out.println("1. Enter grades manually");
        System.out.println("2. Read grades from a file");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()

        if (option == 1) {
            takeInputFromUser(scanner, transcript);
        } else if (option == 2) {
            takeInputFromFile(scanner, transcript);
        } else {
            System.out.println("Invalid option. Exiting the program.");
            return;
        }

        // Print the transcript
        System.out.println(transcript.toString());
    }
}



