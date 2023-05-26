package org.example.ThreeBlockTasks;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    String name;
    int age;
    Sex sex;

    public Student(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
