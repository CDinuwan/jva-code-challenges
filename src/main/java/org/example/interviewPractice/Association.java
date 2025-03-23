package org.example.interviewPractice;

public class Association {
}

class Student {
    String name;
    Teacher teacher;

    Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}