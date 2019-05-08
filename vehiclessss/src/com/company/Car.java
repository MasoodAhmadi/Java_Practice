package com.company;

public class Car {
    private String model="";
    private int engineSize=0;
    private int speed=0;

    public Car( ){
        //System.out.println("Car's 0 parameter constructor");
    }
    public Car( String model, int engineSize, int speed ){
        //System.out.println("Car's 3 parameter constructor");

        this.model = model;
        this.engineSize = engineSize;
        this.speed = speed;
    }

    public String getModel(){
        return model;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed +=5;
    }
    public void printData()  {
        System.out.println( "Model: " + model );
        System.out.println("Engine size: " + engineSize );
        System.out.println( "Speed: " + speed );
    }
}