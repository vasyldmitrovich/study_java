package com.idk.edu06_OOP_Part1.imports;

public class Point {
    public int x, y; // Атрибути

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")"; // Перевизначення toString
    }

    public void print() {
        // Видалено виклик .toString() для усунення варнінгу
        System.out.println("Point: " + this);
    }
}