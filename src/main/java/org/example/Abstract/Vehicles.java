package org.example.Abstract;


abstract class Vehicles {
    int wheel;
    String wheelType;
    String vehicleType;

    public Vehicles(int wheel, String wheelType, String vehicleType) {
        this.wheel = wheel;
        this.wheelType = wheelType;
        this.vehicleType = vehicleType;
    }

    abstract void displayVehicleType();

    void speed(){
        System.out.println("Speed is : 100 km/h");
    }

}
