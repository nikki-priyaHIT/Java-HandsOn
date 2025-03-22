package org.example.Inheritance.SingleLevel;

public class Vehicle {
    String type;
    int wheels;
    String color;
    boolean validVehicle;

    Vehicle(String type, int wheels, String color, boolean validVehicle){
        this.type=type;
        this.wheels=wheels;
        this.color=color;
        this.validVehicle=validVehicle;
    }

    Vehicle(){

    }

    void vehicletype(){
        System.out.println("Vehicle type is "+type);
    }

}
