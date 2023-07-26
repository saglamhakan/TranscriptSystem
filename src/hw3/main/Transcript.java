package hw3.main;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
    private int studentId;
    private List<CourseGrade> courseGrades;
    private double GPA;

    // Constructor with studentID
    public Transcript(int studentId) {
        this.studentId = studentId;
        this.GPA = 0.0;
        this.courseGrades = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Add a course to the transcript
    public void addCourseTaken(CourseGrade courseGrade) {
        if (courseGrade != null) {
            courseGrades.add(courseGrade);
            GPA = calculateGPA();
        } else {
            System.out.println("Error: Cannot add null courseGrade to the transcript.");
        }
    }

    // Calculate the GPA
    private double calculateGPA() {
        if (courseGrades.isEmpty()) {
            return 0.0;
        }

        double totalNumericGrade = 0.0;
        int totalCredits = 0;

        for (CourseGrade courseGrade : courseGrades) {
            totalNumericGrade += courseGrade.getGradeTaken().getNumericValue() * courseGrade.getCourseCredit();
            totalCredits += courseGrade.getCourseCredit();
        }

        return totalNumericGrade / totalCredits;
    }

    // ToString method
    @Override
    public String toString() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Student ID: ").append(studentId).append("\n");

        for (CourseGrade courseGrade : courseGrades) {
            transcript.append(courseGrade.toString()).append("\n");
        }

        transcript.append("GPA: ").append(GPA);

        return transcript.toString();
    }

}
