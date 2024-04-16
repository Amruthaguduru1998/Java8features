package java8.defaultandstaticmethod;

interface Vehicle{
    String getBrand();
    String speedUp();
    String slowDown();

    default String turnAlramOn(){
        return "turn vehicle alaram on";
    }

    default String turnAlramoff(){
        return "turn vehicle alaram off";
    }

    static String getCompany(){
        return "TechMahindra";
    }
}
class Car implements  Vehicle{

    @Override
    public String getBrand() {
        return "Maruthi";
    }

    @Override
    public String speedUp() {
        return "car speed is up";
    }

    @Override
    public String slowDown() {
        return "car slow is down";
    }
}
public class DefaultDemo {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());

        System.out.println(car.turnAlramOn());
        System.out.println(car.turnAlramoff());

        System.out.println(Vehicle.getCompany());

    }
}
