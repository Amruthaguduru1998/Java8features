package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class SortingDemo {

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Ammu",25,30000));
        employees.add(new Employee(2,"veera",30,70000));
        employees.add(new Employee(3,"monu",5,20000));
        employees.add(new Employee(4,"riya",4,25000));
        employees.add(new Employee(5,"chesu",2,15000));

//        //ascending order
        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        System.out.println("-----------------");
        employees.stream().sorted((o1, o2) -> o1.getAge()- o2.getAge()).forEach(System.out::println);

        System.out.println("-----------------");
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

        System.out.println("-------------------------");

        List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("----------------------------descending--------------");
        //descending order

        employees.stream().sorted(Collections.reverseOrder((o1, o2) -> o1.getAge()- o2.getAge())).forEach(System.out::println);

        System.out.println("-----------------");
        employees.stream().sorted((o1, o2) -> o2.getAge()- o1.getAge()).forEach(System.out::println);

        System.out.println("-----------------");
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

        System.out.println("-------------------------");

        List<Employee> list1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(list1);

    }
}
