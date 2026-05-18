package com.idk.edu08_Nested_Classes.pw;

public class AppTest {

    static void check(boolean condition, String msg) {
        System.out.println(condition ? "PASS: " + msg : "FAIL: " + msg);
    }

    public static void main(String[] args) {

        Department dept1 = new Department("IT", new Department.Address("Kyiv", "Khreshchatyk", 1));
        Department dept2 = dept1.clone();
        dept2.address.city = "Lviv";

        check(dept1.address.city.equals("Kyiv"), "original city unchanged");
        check(dept2.address.city.equals("Lviv"), "clone city changed");
        check(dept1.address != dept2.address,    "different address objects");
        check(dept1.name.equals(dept2.name),     "name copied correctly");
    }
}
