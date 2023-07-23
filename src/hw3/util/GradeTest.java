package hw3.util;

public class GradeTest {
    public static void main(String[] args) {
        for (GradeType grade : GradeType.values()) {
            System.out.println(grade.toString());
        }
    }
}
