package org.example.Inheritance.SingleLevel;

// another class
class Train extends Vehicle {

    int seats;
    String wheelType;

    public Train(String type, int wheels, String color, boolean validVehicle, int seats, String wheelType) {
        super(type, wheels, color, validVehicle);
        this.seats = seats;
        this.wheelType = wheelType;
    }


    void displayTrainDetails(){
        System.out.println("Type of Vehicle is "+type+" and it's seat capacity is "+seats+" it's wheel type is "+wheelType+" with color "+color+" and i think it's a vehicle do you agree "+validVehicle);
    }
    public static void main(String[] args) {
        Train obj = new Train("Malgadi", 100, "Copper", true, 10000, "Metal");
        obj.displayTrainDetails();
        obj.vehicletype();
    }
}
