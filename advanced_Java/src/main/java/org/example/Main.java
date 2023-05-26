package org.example;

import org.example.OneTask.ArrayIterator;
import org.example.Tree.Employee;
import org.example.Tree.EmployeeComparators;
import org.example.Two.Sex;
import org.example.Two.Student;
import org.example.animals.Elements.Crocodile;
import org.example.animals.Elements.Dodo;
import org.example.animals.Elements.Lion;
import org.example.OneTask.OneTask;
import org.example.animals.Entites.TextConstants;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        Crocodile crocodile = new Crocodile();
        Dodo dodo = new Dodo();
        Lion lion = new Lion();

        lion.movement();
        System.out.println(lion.getSpeed());

        List<String> name = List.of("nikita", "nikita", "vlad", "luda", "misha");
        OneTask oneTask = new OneTask();

        List<?> result = oneTask.duplicationRemoval(name);
        name = (List<String>) result;

        for(String s : name){
            System.out.println(s);
        }


        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(numbers);

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }



        System.out.println("----3----");
        System.out.println(oneTask.countNumber(3, 2));

        System.out.println("----4----");
        System.out.println(oneTask.permutation("bb a", "baa "));

        System.out.println("----5----");
        System.out.println(oneTask.stringСompression("aabcaaaa"));

        System.out.println("----6----");
        System.out.println(OneTask.findMostRepeatedChar("aabcaaaalkfnvjnaddddddddddd"));

        System.out.println("----6----");
        System.out.println(OneTask.validateBrackets("(((((aabc(((aaaa)))lkfn(vjnad(dddddddddd(((((((((((("));

        System.out.println("----7----");
        System.out.println(OneTask.reduceSpaces("            d         d         d              "));

        System.out.println("----8----");
        System.out.println(OneTask.findPairs(new int[]{4,1,2,4,4,2}));


        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("----------+1+---------");

        List<Student> students = List.of(
                new Student("Вася", 16, Sex.MAN),
                new Student("Петя", 23, Sex.MAN),
                new Student("Леша", 23, Sex.MAN),
                new Student("Елена", 42, Sex.WOMAN),
                new Student("Иван Иванович", 69, Sex.MAN)
        );

        List<Student> conscription = students.stream()
                .filter(s -> s.getSex() == Sex.MAN)
                .filter(s -> s.getAge() >= 18 && s.getAge() <= 27)
                .toList();

        long workers = students.stream()
                .filter(s -> s.getAge() >= 18)
                .filter(s -> (s.getSex() == Sex.WOMAN && s.getAge() <= 55) ||
                        (s.getSex() == Sex.MAN && s.getAge() <= 60))
                .count();


        System.out.println("Conscription: " + conscription.get(new Random().nextInt(conscription.size())).getName());
        System.out.println("Potential workers: " + workers);


        System.out.println("----------+3+---------");

        List<String> elements = List.of("a1", "c2", "b0", "f0", "d1", "a1", "c2");

        elements = elements.stream().sorted().map(e -> String.join("_", e.split(""))).toList();
        elements.forEach(System.out::println);

        int[] el = elements.stream().sorted().map(e -> e.substring(2)).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(el).asLongStream().forEach(System.out::println);

        elements = elements.stream().sorted().distinct().toList();
        elements.forEach(System.out::println);


        System.out.println("----------+4+---------");
        List<Employee> employees = List.of(
                new Employee(95, 16, 5),
                new Employee(100000, 16, 5),
                new Employee(100001, 16, 5),
                new Employee(100002, 16, 5)
        );

        employees.forEach(e -> {
            System.out.println(e.getAge() + " " + e.getSalary() + " " + e.getYearsOfService());
        });

        System.out.println(" ");

        employees.forEach(e -> {
            System.out.println( EmployeeComparators.SalaryComparator.compare(e, new Employee(95, 16, 5)));
        });

        System.out.println(" ");

        employees.forEach(e -> {
            if(e.getSalary() > 100000){
                System.out.println(e.getAge() + " " + e.getSalary() + " " + e.getYearsOfService());
            }
        });

        System.out.println(" ");

        Employee tempEmployee = new Employee(0.0, 0, 0);
        employees.forEach(e -> {
            if(e.getSalary() > tempEmployee.getSalary()){
                tempEmployee.setSalary(e.getSalary());
            }
        });
        System.out.println(tempEmployee.getSalary());

        System.out.println(" ");

        double tempSalary = 0.0;
        /*employees.forEach(e -> {
            double v = e.getSalary();
            tempSalary += 1;
        });
*/
    }

}