package main;

import university.*;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John");
        Course course = new Course(1, "Java");
        Enrollment enrollment = new Enrollment(student, course);
        System.out.println(enrollment.getStudent().getName());
        System.out.println(enrollment.getCourse().getCourseName());
        System.out.println(student.getStudentId());
        System.out.println(course.getCourseId());
        System.out.println(student.getName());
        System.out.println(course.getCourseName());
    }
}