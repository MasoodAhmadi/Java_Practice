package com.company;

import java.util.ArrayList;

public class ll {

    public static void main(String[] args) {
        Address myAddress = new Address();
        System.out.println( myAddress);
        Address otherAddress = new Address("Kuntokatu", "33540", "Tampere");
        System.out.println( otherAddress);
        Student tony = new Student();
        Student pekka = new Student( "Pekka", 30 );
        Student kalle = new Student( "Kalle", 20, otherAddress);
        Student marja = new Student( "Marja", 0, "Teiskontie", "33540", "Tampere");
        marja.addCourse("Programming basics", 5);
        marja.addCourse( "Software Engineering", 4);
        marja.addCourse( new Course( "Mathematics", 5 ));
        marja.printData();

    }
}

class Student {
    private String name;
    private int creditPoints;
    private Address homeAddress;
    private ArrayList<Course> courses = new ArrayList();

    // ToDo: implement constructors, setters, getters and toString method
    public Student(){
        name = "unknown";
        creditPoints = 0;
        // Everything is empty by default, creditPoints is 0
        homeAddress = new Address("N/A", "N/A", "N/A");
    }
    public Student( String aName, int aCreditPoints ){
        name = aName;
        creditPoints = aCreditPoints;
        homeAddress = new Address("N/A", "N/A", "N/A");
    }

    public Student( String aName, int aCreditPoints, Address aHomeAddress ){
        name = aName;
        creditPoints = aCreditPoints;
        homeAddress = aHomeAddress;
    }

    public Student( String aName, int aCreditPoints, String aStreet, String aPostalCode, String aCity ){
        name = aName;
        creditPoints = aCreditPoints;
        homeAddress = new Address( aStreet, aPostalCode, aCity );
    }
    public String getName() {
        return name;
    }
    public int getCreditPoints() {
        creditPoints = 0;
        for( Course c : courses ){ // sum of creditPoints
            creditPoints += c.getCreditPoints();
        }
        return creditPoints;
    }

    public void addCreditPoints( int pointsToAdd ){
        creditPoints = creditPoints + pointsToAdd;
    }

    public Address getAddress() {
        return homeAddress;
    }
    public void setAddress(Address aHomeAddress) {
        homeAddress = aHomeAddress;
    }

    public void addCourse( String aCourseName, int aCourseCreditPoints ){
        courses.add( new Course( aCourseName, aCourseCreditPoints ));
        creditPoints += aCourseCreditPoints;
    }

    public void addCourse( Course aCourse ){
        courses.add( aCourse );
        creditPoints += aCourse.getCreditPoints();
    }

    public void printData() {
        System.out.println( name );
        System.out.println( "CreditPoints: " +  creditPoints);
        System.out.println( homeAddress );
        System.out.println("Courses completed:");
        for( Course c : courses ){
            c.printData();
        }
    }
}

class Address {
    private String street;
    private String postalCode;
    private String city;

    // ToDo: implement constructors, setters, getters, and toString methods
    public Address(){
        // by default, every string is empty
    }

    public Address( String aStreet, String aPostalCode, String aCity){
        street = aStreet;
        postalCode = aPostalCode;
        city = aCity;
    }
    public String toString() {
        return "Address\n" + street + "\n" + postalCode + "\n" + city;
    }
}

class Course {
    private String name;
    private int creditPoints;

    public Course( String name, int creditPoints ){
        this.name = name;
        this.creditPoints = creditPoints;
    }
    public int getCreditPoints() {
        return creditPoints;
    }

    public void printData() {
        System.out.println("Course name: " + name + "\nCredits: " + creditPoints );
    }
}