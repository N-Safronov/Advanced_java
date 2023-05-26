package org.example.Tree;

import java.util.Comparator;

public class EmployeeComparators {
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };

    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getAge(), e2.getAge());
        }
    };

    public static Comparator<Employee> YearsOfServiceComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getYearsOfService(), e2.getYearsOfService());
        }
    };
}
