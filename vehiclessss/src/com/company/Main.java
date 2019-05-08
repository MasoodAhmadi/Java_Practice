package com.company;
//import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Business of Cars ");
        ArrayList<Car> cars=new ArrayList<>();
        Car Mercedes =new Car("BENZ",40,40);
        Car BMW = new Car (" Rover ",40,70);
        Truck Longe= new Truck("Pickup",34,42,10);
        cars.add(Mercedes);
        cars.add(BMW);
        cars.add(Longe);
          for (Car c: cars)
          c.printData();
    }
}