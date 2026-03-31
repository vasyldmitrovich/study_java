package com.idk.edu06_OOP_Part1.imports;

public class ColorLine extends Line { // Розширює Line
    public String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public void print() {
        // Використано конкатенацію замість format() для усунення варнінгу
        System.out.println(super.toString() + " [Color: " + color + "]");
    }
}