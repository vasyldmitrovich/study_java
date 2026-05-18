package com.idk.edu08_Nested_Classes.pw;

public class App {

    public static void main(String[] args) {

        Department dept1 = new Department("IT", new Department.Address("Kyiv", "Khreshchatyk", 1));

        Department dept2 = dept1.clone();
        dept2.address.city = "Lviv";

        System.out.println(dept1);
        System.out.println(dept2);
    }
}
