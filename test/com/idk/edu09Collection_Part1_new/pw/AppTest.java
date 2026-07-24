package com.idk.edu09Collection_Part1_new.pw;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class AppTest {

    @Test
    public void testTask1Logic() {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(50, "Tools"));
        boxes.add(new HeavyBox(120, "Books"));
        boxes.add(new HeavyBox(80, "Spare Parts"));
        boxes.add(new HeavyBox(200, "Equipment"));

        Assert.assertEquals(4, boxes.size());

        boxes.get(0).setWeight(boxes.get(0).getWeight() + 1);
        Assert.assertEquals(51, boxes.get(0).getWeight());

        boxes.remove(boxes.size() - 1);
        Assert.assertEquals(3, boxes.size());
        Assert.assertEquals("Spare Parts", boxes.get(boxes.size() - 1).getContents());

        boxes.clear();
        Assert.assertEquals(0, boxes.size());
    }

    @Test
    public void testTask2Logic() {
        String inputStr = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] tokens = inputStr.split(",\\s*");
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>();
        for (String t : tokens) {
            uniqueSet.add(t.trim());
        }

        String result = String.join(", ", uniqueSet);
        Assert.assertEquals("1, 2, 3, 4, 5, 6, 7, 8", result);
    }

    @Test
    public void testTask3Logic() {
        ArrayList<Integer> myCollection = new ArrayList<>();
        myCollection.add(3);
        myCollection.add(10);
        myCollection.add(25);
        myCollection.add(2);
        myCollection.add(6);

        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        Assert.assertEquals(3, newCollection.size());
        Assert.assertEquals(Integer.valueOf(1), newCollection.get(0));
        Assert.assertEquals(Integer.valueOf(2), newCollection.get(1));
        Assert.assertEquals(Integer.valueOf(4), newCollection.get(2));

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        Assert.assertEquals(4, myCollection.size());
        Assert.assertFalse(myCollection.contains(25));

        if (2 <= myCollection.size()) myCollection.add(2, 1); else myCollection.add(1);
        Assert.assertEquals(Integer.valueOf(1), myCollection.get(2));

        Collections.sort(myCollection);
        Assert.assertEquals(Integer.valueOf(1), myCollection.get(0));
        Assert.assertEquals(Integer.valueOf(10), myCollection.get(myCollection.size() - 1));
    }
}