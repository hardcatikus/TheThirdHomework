package com.netcracker.chapter3.project8;

public class StudentTester {
    public static void main(String[] args) {

        Student student = new Student("Mary");

        student.addQuiz(4);
        student.addQuiz(5);
        student.addQuiz(4);
        student.addQuiz(3);

        System.out.println(student);
    }
}
