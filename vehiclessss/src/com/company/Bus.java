package com.company;

public class Bus extends Car{
    int numberofpassengers;

        public Bus(String model,int engineSize,int speed,int numberofpassenger){
            super(model,engineSize,speed);
            this.numberofpassengers=numberofpassenger;
        }
        public int getNumberofpassengers() {
            return numberofpassengers;
        }
        public void setNumberofpassengers(int numberofpassengers) {
            this.numberofpassengers=numberofpassengers;
        }
        public void printdata(){
            super.printData();
            System.out.println("number of passenger"+numberofpassengers);
        }

    }
