package University_Enrollment_System;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    private Professor instructor; // aggregation git 22-1-2026
    private int maxCapacity;
    private List<Student>enrolledStudent;

    public Course(String courseName,String courseCode, Professor instructor, int maxCapacity ){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor= instructor;
        this.maxCapacity= maxCapacity;
        this.enrolledStudent= new ArrayList<>();


    }
    // check for capacity exception
    public void enrolledStudent(Student s) throws EnrollmentException {
        if (enrolledStudent.size() >= maxCapacity) {
            throw new EnrollmentException("Course" + courseCode + "is full.");
        }
        enrolledStudent.add(s);
        System.out.println("Enrolled" + s.getName());
        // output generate
    }
        public void displayDetails() {
            System.out.println("Course Details ");
            System.out.println("Course " + courseName + "(" + courseCode + ")");
            System.out.println("Instructor :");
            if (instructor != null) System.out.println(instructor.getName());
            else System.out.println("To be allocated soon");

            System.out.println("Enrolled Student: ");
            for (Student s : enrolledStudent) {
                System.out.println("-"+ s.toString());
            }
        }
    }
