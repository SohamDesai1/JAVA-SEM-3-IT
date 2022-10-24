package com.company;
class Student {
    String name;
    int age;
    String address;
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }
    public void setInfo(int age, String name) {
        this.name = name;
        this.age = age;
    }
    public void setInfo(int age, String name, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void display() {
        System.out.println(name + " " + age + " " + address);
    }
    public static class do_it7 {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.setInfo(10, "soham");
            s1.display();
            s1.setInfo(11, "soham", "mumbai");
            s1.display();
        }
    }
}