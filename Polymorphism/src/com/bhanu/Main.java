package com.bhanu;


class Car{

    private int cylinder;
    public int wheels = 4;
    private String name;
    public boolean engine = true;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;

    }

    public Car(){
        this(3,"audi");
        System.out.println("empty constructor called");

    }

    public int getCylinder() {

        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startengine(){
        return "Car is started";


    }

    public int accelerate(int speed){
        System.out.println("Car is accelerated to ");
        return speed;

    }

    public String brake(){
        return "brake is applied ";

    }
}

class Bus extends Car{
    public Bus() {
        super(4,"Bus");
    }

    @Override
    public String startengine() {
        return "Bus is started";

    }

    @Override
    public int accelerate(int speed) {
        System.out.println("Bus is accelarated with speed of ");
        return speed;


    }

    @Override
    public String brake() {
        return "brake is applied to the bus";

    }

}

class Bike extends  Car{
    public Bike() {
        super(1,"Bike");
    }

    @Override
    public String startengine() {
        return "Bike is started";


    }

    @Override
    public int accelerate(int speed) {
        System.out.println("Bike is accelerated with the speed of ");
        return speed;

    }



//    @Override
//    public boolean brake() {
//        System.out.println("Break is applied to Bike");
//        return true;
//    }
}














public class Main {

    public static void main(String[] args) {
        Car car = new Car(2,"Audi");
        System.out.println("number of cylinders is "+ car.getCylinder());
        System.out.println("name of car is "+ car.getName());
        System.out.println("number of wheels is "+ car.wheels);
        System.out.println(car.startengine());
        System.out.println(car.accelerate(45));
        System.out.println(car.brake());

        Bus bus = new Bus();
        System.out.println("number of wheels is "+ bus.wheels);
        System.out.println(bus.startengine());
        System.out.println(bus.accelerate(60));
        System.out.println(bus.brake());

        Bike bike = new Bike();
        System.out.println(bike.startengine());
        System.out.println(bike.accelerate(80));
        System.out.println(bike.brake());

    }
}
