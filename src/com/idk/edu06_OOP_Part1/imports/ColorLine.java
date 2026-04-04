package com.idk.edu06_OOP_Part1.imports;

import java.util.Objects;

public class ColorLine extends Line {
    private String color;

    public ColorLine() {
        super();
        this.color = "black";
    }

    public ColorLine(Point begin, Point end, String color) {
        super(begin, end);
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof ColorLine that)) return false;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), color); }

    @Override
    public String toString() {
        return "ColorLine{color='" + color + "', " + super.toString() + "}";
    }
}