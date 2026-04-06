package com.idk.edu06_OOP_Part1.imports;

import java.util.Objects;

public class Line {
    private Point begin;
    private Point end;

    public Line() {
        this.begin = new Point();
        this.end = new Point();
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() { return begin; }
    public void setBegin(Point begin) { this.begin = begin; }

    public Point getEnd() { return end; }
    public void setEnd(Point end) { this.end = end; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return Objects.equals(begin, line.begin) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() { return Objects.hash(begin, end); }

    @Override
    public String toString() {
        return "Line{begin=" + begin + ", end=" + end + "}";
    }
}