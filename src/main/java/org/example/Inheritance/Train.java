package org.example.Inheritance;

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
        System.out.println("Type of Vehicle is "+type+"and it's seat capacity is "+seats+"it's wheel type is "+wheelType+"with color "+color+" and i think it's a vehicle do you agree "+validVehicle);
    }
}
