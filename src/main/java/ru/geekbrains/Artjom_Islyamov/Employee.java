package ru.geekbrains.Artjom_Islyamov;

public class Employee {
    private final String fullName;
    private final String post;
    private final String eMail;
    private final Long phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String fullName, String post, String eMail, Long phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("%nfullName = %s, post = %s, eMail = %s, phoneNumber = %d, salary = %d, age = %d%n", fullName, post, eMail, phoneNumber, salary, age);
    }
}
