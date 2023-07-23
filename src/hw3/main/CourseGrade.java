package hw3.main;

import hw3.util.GradeType;

public class CourseGrade {

    private String courseDepartment = "CENG";
    private int courseCode = 100;
    private int courseCredit = 4;
    private GradeType gradeTaken = GradeType.F;



    public CourseGrade(String courseDepartment) {
        this(courseDepartment, 4, 4, GradeType.F);
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        this(courseDepartment, 2, 3, GradeType.D);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        this(courseDepartment, 1,3, GradeType.F);
    }


    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, GradeType gradeTaken) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(gradeTaken);
    }


    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        if (courseDepartment != null && courseDepartment.length() <= 4) {
            this.courseDepartment = courseDepartment;
        } else {
            this.courseDepartment = "CENG"; //Default value
        }
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        if (courseCode >= 100 && courseCode <= 599) {
            this.courseCode = courseCode;
        } else {
            this.courseCode = 100; // Default value
        }
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if (courseCredit == 3 || courseCredit == 4) {
            this.courseCredit = courseCredit;
        } else {
            this.courseCredit = 4;
        }
    }

    public GradeType getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(GradeType g) {
        this.gradeTaken = g;
    }

    public void setGradeTaken(double val) {
        if (val >= 0.0 && val <= 4.0) {
            if (Math.abs(val - GradeType.A.getNumericValue()) <= 0.5) {
                this.gradeTaken = GradeType.A;
            } else if (Math.abs(val - GradeType.B.getNumericValue()) <= 0.5) {
                this.gradeTaken = GradeType.B;
            } else if (Math.abs(val - GradeType.C.getNumericValue()) <= 0.5) {
                this.gradeTaken = GradeType.C;
            } else if (Math.abs(val - GradeType.D.getNumericValue()) <= 0.5) {
                this.gradeTaken = GradeType.D;
            } else {
                this.gradeTaken = GradeType.F;
            }
        } else {
            this.gradeTaken = GradeType.F;
        }
    }



    @Override
    public String toString() {
        return "Department: " + courseDepartment +
                " CourseCode: " + courseCode +
                " Credit: " + courseCredit +
                " Grade: " + gradeTaken.getStringValue();
    }
}
