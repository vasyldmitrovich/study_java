package com.idk.edu06_OOP_Part1.imports;

public class Line {
    public Point start, end; // Містить два об'єкти класу Point

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line from " + start + " to " + end;
    }

    public void print() {
        System.out.println(this);
    }
}