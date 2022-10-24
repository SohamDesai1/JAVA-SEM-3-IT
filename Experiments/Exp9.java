package com.company;
class Teacher {
    Teacher() {
        System.out.println("Hello, I am teacher");
    }
    String name = "Soham Desai";
    int id = 11;
    String subject = "JAVA";
    String branch = "Information Technology";
    void display() {
        System.out.println("The name of the teacher is " + name);
        System.out.println("The teacher id is " + id);
        System.out.println("The subject is " + subject);
        System.out.println("The branch is " + branch);
    }
}
class Professor extends Teacher {
    Professor() {
        System.out.println("Hello, I am a Professor");
    }
    int salary;
}
class Associate_Professor extends Teacher {
    Associate_Professor() {
        System.out.println("Hello, I am an associate professor");
    }
    int salary;
    int professor_id;
}
class Assistant_Professor extends Teacher {
    Assistant_Professor() {
        System.out.println("Hello, I am an assistant Professor");
    }
}
public class Exp9 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.display();
        Professor professor = new Professor();
        Associate_Professor associateProfessor = new Associate_Professor();
        Assistant_Professor assistantProfessor = new Assistant_Professor();
    }
}
