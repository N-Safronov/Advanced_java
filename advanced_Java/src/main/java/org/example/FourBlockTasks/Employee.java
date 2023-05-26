package org.example.FourBlockTasks;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private double salary;
    private int age;
    private int yearsOfService;

    public Employee(double salary, int age, int yearsOfService) {
        this.salary = salary;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }


}
