package com.company;

public class Truck extends Car{
    private int capacity;

    public Truck(){

    }
    public Truck(String model,int engineSize,int speed,int capacity){
        super (model,engineSize,speed);
        this.capacity=capacity;
    }

    public void printdata(){
        super.printData();
        System.out.println("Capacity of Truck: "+capacity);
    }
}