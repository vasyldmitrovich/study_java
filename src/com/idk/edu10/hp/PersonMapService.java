package com.idk.edu10.hp;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/** personMap: key = last name, value = first name. */
public class PersonMapService {

    public static Map<String, String> createPersonMap() {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Petrenko", "Orest");
        personMap.put("Shevchenko", "Olena");
        personMap.put("Kovalenko", "Andriy");
        personMap.put("Bondar", "Maryna");
        personMap.put("Melnyk", "Orest");
        personMap.put("Tkachenko", "Iryna");
        personMap.put("Kravchenko", "Dmytro");
        personMap.put("Boyko", "Olena");
        personMap.put("Lysenko", "Bohdan");
        personMap.put("Savchenko", "Taras");
        return personMap;
    }

    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static boolean hasDuplicateFirstNames(Map<String, String> map) {
        Set<String> seen = new HashSet<>();
        for (String firstName : map.values()) {
            if (!seen.add(firstName)) {
                return true;
            }
        }
        return false;
    }

    /** Removes every person with the given first name. */
    public static void removeByFirstName(Map<String, String> map, String firstName) {
        map.values().removeIf(v -> v.equals(firstName));
    }
}
