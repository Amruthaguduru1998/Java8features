package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {
    public static void main(String[] args) {

        List<Procuct> list = new ArrayList<>();
        for (Procuct procuct : getProducts()) {
            if (procuct.getCost() > 25000) {
                list.add(procuct);
            }
        }
        for (Procuct procuct : list) {
            System.out.println(procuct);
        }
        System.out.println("----------------------");
        //using streams
        getProducts().stream().filter(p -> p.getCost() > 25000).forEach(System.out::println);
       // collect.forEach(System.out::println);
    }
    private static List<Procuct> getProducts(){
        List<Procuct> procuctList=new ArrayList<>();
        procuctList.add(new Procuct(1,"Hp Laptop",25000));
        procuctList.add(new Procuct(2,"dell Laptop",30000));
        procuctList.add(new Procuct(3,"lenevo Laptop",28000));
        procuctList.add(new Procuct(4,"sony Laptop",28000));
        procuctList.add(new Procuct(5,"asus Laptop",50000));

        return procuctList;
    }
}

class Procuct{

    private int id;
    private String Name;
    private int cost;

    public Procuct() {
    }

    public Procuct(int id, String name, int cost) {
        this.id = id;
        Name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Procuct{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", cost=" + cost +
                '}';
    }
}