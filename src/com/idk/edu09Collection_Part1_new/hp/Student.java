package com.idk.edu09Collection_Part1_new.hp;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }
    public ArrayList<Integer> getGrades() { return grades; }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }
}