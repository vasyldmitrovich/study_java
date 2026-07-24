package com.idk.edu09Collection_Part1_new.pw;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("\n--- TASK 1 ---");
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(50, "Tools"));
        boxes.add(new HeavyBox(120, "Books"));
        boxes.add(new HeavyBox(80, "Spare Parts"));
        boxes.add(new HeavyBox(200, "Equipment"));

        for (HeavyBox b : boxes) {
            System.out.println(b);
        }

        if (!boxes.isEmpty()) {
            boxes.get(0).setWeight(boxes.get(0).getWeight() + 1);
        }

        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }

        System.out.println();
        for (HeavyBox b : boxes) {
            System.out.println(b);
        }

        boxes.clear();
        System.out.println("Size after clear: " + boxes.size());
    }

    public static void task2() {
        System.out.println("\n--- TASK 2 ---");
        String inputStr = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        System.out.println("Input: " + inputStr);

        String[] tokens = inputStr.split(",\\s*");
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>();
        for (String t : tokens) {
            uniqueSet.add(t.trim());
        }

        String result = String.join(", ", uniqueSet);
        System.out.println("Result: " + result);
    }

    public static void task3() {
        System.out.println("\n--- TASK 3 ---");
        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(30) + 1);
        }
        System.out.println("Initial: " + myCollection);

        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Indices > 5: " + newCollection);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        System.out.println("After removing > 20: " + myCollection);

        if (2 <= myCollection.size()) myCollection.add(2, 1); else myCollection.add(1);
        if (5 <= myCollection.size()) myCollection.add(5, -4); else myCollection.add(-4);
        if (8 <= myCollection.size()) myCollection.add(8, -3); else myCollection.add(-3);

        System.out.println();
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("\nSorted: " + myCollection);
    }
}