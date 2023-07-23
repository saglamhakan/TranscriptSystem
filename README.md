Transcript Generator
Overview
Transcript Generator is a Java application that allows users to create and manage student transcripts. It provides classes to represent student grades, courses, and transcripts, as well as functionality to calculate GPAs and generate printable transcripts.

Features
Create and manage student grades for different courses.
Calculate GPA based on the grades obtained in each course.
Generate a printable transcript for each student.
Packages and Classes
The application is organized into two packages:

1. hw3.util
   This package contains the utility classes used in the application.

- GradeType Enum
  The GradeType enum represents the grade of a student and defines constants for grades A, B, C, D, and F. Each constant has a stringValue and a numericValue associated with it.

- GradeTest Class
  The GradeTest class is a test program for the GradeType enum. It uses the enhanced for loop and the values() method of the enum to print out the grades along with their corresponding numeric values.

2. hw3.main
   This package contains the main classes that handle the generation of transcripts.

- CourseGrade Class
  The CourseGrade class represents information about a course taken by a student. It includes fields for the course department, course code, course credit, and grade obtained. The class provides appropriate getter and setter methods for these fields. It also has overloaded constructors to handle different input scenarios and a toString() method to display the information in a formatted manner.

- Transcript Class
  The Transcript class holds the transcript of a student, including the student's ID and a list of CourseGrade objects representing the grades obtained in different courses. It calculates the GPA based on the grades and provides an addCourseTaken() method to add courses to the transcript. The toString() method displays the student's ID, course details, and GPA in a readable format.# TranscriptSystem
