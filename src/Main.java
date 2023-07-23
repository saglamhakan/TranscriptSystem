import hw3.main.CourseGrade;
import hw3.main.Transcript;
import hw3.util.GradeType;

public class Main {
    public static void main(String[] args) {

        Transcript transcript = new Transcript(1112234);
        CourseGrade course1 = new CourseGrade("CENG",180,4, GradeType.A);
        CourseGrade course2 = new CourseGrade("COMP", 201, 3, GradeType.A);
        CourseGrade course3 = new CourseGrade("ECE", 202, 3,GradeType.A);
        CourseGrade course4 = new CourseGrade("ME", 300, 4, GradeType.F);

        System.out.println("\nTranscript:");
        transcript.addCourseTaken(course1);
        transcript.addCourseTaken(course2);
        transcript.addCourseTaken(course3);
        transcript.addCourseTaken(course4);

        System.out.println(transcript.toString());
    }


    }
