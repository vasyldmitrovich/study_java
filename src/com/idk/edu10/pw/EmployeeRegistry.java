package com.idk.edu10.pw;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeRegistry {
    private final Map<Integer, Employee> employees = new LinkedHashMap<>();

    /** Returns false (and does not add) if ID or name already exists. */
    public boolean add(Employee employee) {
        if (employees.containsKey(employee.getId()) || containsName(employee.getName())) {
            return false;
        }
        employees.put(employee.getId(), employee);
        return true;
    }

    public boolean containsId(int id) {
        return employees.containsKey(id);
    }

    public boolean containsName(String name) {
        for (Employee e : employees.values()) {
            if (e.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean edit(int id, String name, String position, double salary) {
        Employee e = employees.get(id);
        if (e == null) {
            return false;
        }
        e.setName(name);
        e.setPosition(position);
        e.setSalary(salary);
        return true;
    }

    /** Returns a sorted copy of the map, or null for an unknown criterion. */
    public Map<Integer, Employee> sortedBy(String criterion) {
        Comparator<Employee> comparator;
        switch (criterion.toLowerCase()) {
            case "id":
                comparator = Comparator.comparingInt(Employee::getId);
                break;
            case "name":
                comparator = Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);
                break;
            case "position":
                comparator = Comparator.comparing(Employee::getPosition, String.CASE_INSENSITIVE_ORDER);
                break;
            default:
                return null;
        }
        Map<Integer, Employee> result = new LinkedHashMap<>();
        employees.values().stream()
                .sorted(comparator)
                .forEach(e -> result.put(e.getId(), e));
        return result;
    }

    public void print() {
        employees.values().forEach(System.out::println);
    }
}
