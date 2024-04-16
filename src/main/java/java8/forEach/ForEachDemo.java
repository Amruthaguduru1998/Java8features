package java8.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {

        List<Person> list=new ArrayList<>();
        list.add(new Person("Ammu",27));
        list.add(new Person("Veera",30));
        list.add(new Person("lali",55));
        list.add(new Person("monu",5));
        list.add(new Person("chasu",2));

        //before java8
        for (Person person:list) {
            System.out.println(person.getAge());
            System.out.println(person.getName());
        }
        //
        list.forEach((x)->{
            System.out.println(x.getName());
            System.out.println(x.getAge());
        } );

        //with streams
        list.stream().forEach(x-> System.out.println(x));
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
