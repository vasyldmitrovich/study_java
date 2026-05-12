package com.idk.edu08_Nested_Classes.hp;

public class AppTest {

    static void check(boolean condition, String msg) {
        System.out.println(condition ? "PASS: " + msg : "FAIL: " + msg);
    }

    public static void main(String[] args) {

        Student s1 = new Student(new FullName("John", "Doe"), 20, 2);

        check(s1.info().contains("John"),             "info contains firstName");
        check(s1.info().contains("Doe"),              "info contains lastName");
        check(s1.info().contains("20"),               "info contains age");
        check(s1.info().contains("2"),                "info contains course");
        check(s1.activity().equals("I study at university"), "activity correct");

        Student s3 = s1.clone();
        s3.course = 3;

        check(s1.course == 2, "original course unchanged after clone");
        check(s3.course == 3, "clone course changed");
    }
}
