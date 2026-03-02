package com.idk.network;

public class TriangleOps {
    // Heron's formula
    public static double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
