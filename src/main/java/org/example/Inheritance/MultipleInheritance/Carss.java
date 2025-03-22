package org.example.Inheritance.MultipleInheritance;

public class Carss extends Vehicless{
    int wheelCount;
    String companyName;
    String colorOfCar;
    int seatCount;

    public Carss(int wheelCount, String companyName, String colorOfCar, int seatCount) {
        this.wheelCount = wheelCount;
        this.companyName = companyName;
        this.colorOfCar = colorOfCar;
        this.seatCount = seatCount;
    }

    Carss(){
        super();
    }

    @Override
    void displayVehicless(){
        System.out.println(companyName+" car have "+seatCount);
    }

    public static void main(String[] args) {
        Vehicless obj = new Carss(4, "BMW", "Black", 7);
        obj.displayVehicless();
        Carss obj1 = new Carss(4, "TATA Avinya", "Copper", 7);
        obj1.displayVehicless();
    }
}
