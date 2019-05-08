package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\tWelcome to Tournament: ");
        Statistics nm=new Statistics();
        Scanner reader= new Scanner(System.in);
        int number;
        System.out.println("Please enter number of players: ");
        number=reader.nextInt();
        String name[]=new String[number];
        int Field_attempts[]=new int[number];
        int Field_made[]=new int [number];
        double Percentage[]= new double[number];
         for (int i = 0; i < number; i++) {
             try {
                 System.out.println("-----------------------Player" + (i + 1) + "-------------------");
                 System.out.println("Please enter the players ID/Name:");
                 name[i] = reader.next();
                 System.out.println("Please enter the player's Field  Goal Attempts");
                 Field_attempts[i] = Integer.parseInt(reader.next());
                 System.out.println("Please enter the player's Field  Goal Made");
                 Field_made[i] = Integer.parseInt(reader.next());
                 Percentage[i]=(Field_made[i]*100) /Field_attempts[i];

             }
             catch (Exception e){
                 System.out.println("Wrong data written !");
             }
         }
                System.out.println("-------------------------------Statistics-------------------------------");
                nm.PrintData();
                for (int i=0; i<number; i++) {
                System.out.println();
                System.out.print(name[i]+"\t\t\t\t\t"+Field_attempts[i]+"\t\t\t\t\t\t" + Field_made[i]+"\t\t\t\t\t\t"+Percentage[i]);
                }

                System.out.println();
                System.out.println();

                System.out.println("------------------------Thanks For Using our Program----------------------");
                System.out.println("---------------------------Code by Masood  Ahmadi-------------------------");
    }
}
class Statistics extends Main{
    public Statistics() {
    }
        public void PrintData (){
            System.out.print("playerID:     ");
            System.out.print("Field Goal Attempt:      ");
            System.out.print("Field Goal Made:      ");
            System.out.print("Field Goal Percentage:      ");
        }
}