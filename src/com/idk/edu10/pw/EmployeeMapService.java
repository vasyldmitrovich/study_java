package com.idk.edu10.pw;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMapService {

    public static Map<Integer, String> createEmployeeMap() {
        Map<Integer, String> employeeMap = new LinkedHashMap<>();
        employeeMap.put(101, "Ivan Petrenko");
        employeeMap.put(102, "Olena Shevchenko");
        employeeMap.put(103, "Andriy Kovalenko");
        employeeMap.put(104, "Maryna Bondar");
        employeeMap.put(105, "Bohdan Melnyk");
        employeeMap.put(106, "Iryna Tkachenko");
        employeeMap.put(107, "Dmytro Kravchenko");
        return employeeMap;
    }

    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("ID: " + e.getKey() + ", name: " + e.getValue());
        }
    }

    public static String findNameById(Map<Integer, String> map, int id) {
        return map.get(id);
    }

    public static Integer findIdByName(Map<Integer, String> map, String name) {
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            if (e.getValue().equals(name)) {
                return e.getKey();
            }
        }
        return null;
    }
}
