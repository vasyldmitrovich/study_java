package com.idk.edu08_Nested_Classes.pw;

public class Department implements Cloneable {

    public String name;
    public Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Department clone() {
        try {
            Department copy = (Department) super.clone();
            copy.address = this.address.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "', address=" + address + "}";
    }

    public static class Address implements Cloneable {

        public String city;
        public String street;
        public int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String toString() {
            return "Address{city='" + city + "', street='" + street + "', building=" + building + "}";
        }
    }
}
