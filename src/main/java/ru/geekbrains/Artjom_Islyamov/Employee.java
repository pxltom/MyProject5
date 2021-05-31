package ru.geekbrains.Artjom_Islyamov;

import javax.jws.Oneway;

public class Employee {
    private String fullName;
    private String post;
    private String eMail;
    private Long phoneNumber;
    private int salary;
    private int age;


    public Employee(String fullName, String post, String eMail, Long phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPost() {
        return post;
    }

    public String geteMail() {
        return eMail;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("%nfullName = %s, post = %s, eMail = %s, phoneNumber = %d, salary = %d, age = %d%n", fullName, post, eMail, phoneNumber, salary, age);
    }

}
