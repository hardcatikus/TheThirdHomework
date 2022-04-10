package com.netcracker.chapter3.project8;

public class Student {

    private String name;
    private int totalScore;
    private int numberOfQuizzes;

    public Student(String name) {
        this.name = name;
        totalScore = 0;
        numberOfQuizzes = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addQuiz(int score){
        totalScore += score;
        ++numberOfQuizzes;
    }

    public double getAverageScore(){
        return totalScore/numberOfQuizzes;
    }

    @Override
    public String toString(){
        return "Student " + getName() + ":\n["
                + "Total quiz score: " + getTotalScore()
                + "; Average score: " + getAverageScore() + "]";
    }
}
