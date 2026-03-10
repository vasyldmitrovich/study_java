package com.idk.edu04_condition.imports;


public class Faculty {
    public enum Season { WINTER, SPRING, SUMMER, AUTUMN }
    
    public int studentsCount;
    public Season currentSeason;

    public Faculty(int studentsCount, Season currentSeason) {
        this.studentsCount = studentsCount;
        this.currentSeason = currentSeason;
    }
}