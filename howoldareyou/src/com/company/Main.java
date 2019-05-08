package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        int age = 0;
        System.out.println("How old are you?");
        age = Integer.parseInt(reader.nextLine());
        System.out.println("Law says that:");
        if (age <= 16) {
            System.out.println("age is less then " + age+" You can't drive");
        } else if (age <= 18) {
            System.out.println("age is less then " + age+" You can't vote");
        } else if (age <= 25) {
            System.out.println("age is less then  " + age+" you can't rent a car");
        } else if (age >= 25) {
            System.out.println("age is 25 or over " + age+" you can do anything that's legal.");
        }
    }
}
