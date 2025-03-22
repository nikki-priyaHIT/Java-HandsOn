package org.example.Inheritance;

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

    // another class
    class Train extends Vehicle{

        int seats;
        String wheelType;

        Train(int seats, String wheelType){
            this.seats=seats;
            this.wheelType=wheelType;
        }
        Train(){
            super();
        }
        void displayTrainDetails(){
            System.out.println("Type of Vehicle is "+type+"and it's seat capacity is "+seats+"it's wheel type is "+wheelType+"with color"+color+"and i think it's a vehicle do you agree"+validVehicle);
        }
    }

    public void main(String[] args) {
        Vehicle obj1 = new Vehicle("Train", 1000, "White and Blue", true);
        Train obj2 = new Train(5000, "Metal");
        System.out.println("Vehicle details as below : ");
        obj2.displayTrainDetails();
    }
}
