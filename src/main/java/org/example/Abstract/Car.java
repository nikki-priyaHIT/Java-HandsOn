package org.example.Abstract;

class Car extends Vehicles {
    String carType;
    String carName;
    int seatCapacity;

    public Car(String carType, String carName, int seatCapacity) {
        super();
        this.carType = carType;
        this.carName = carName;
        this.seatCapacity = seatCapacity;
    }
        @Override
        public void displayVehicleType(){
            System.out.println("Car type is : "+carType+" and it's name is : "+carName+". It's seat capacity is : "+seatCapacity);
    }
    public static void main(String[] args) {
        Car obj = new Car("Sedan" , "Tata Avinya", 7);
        obj.displayVehicleType();
        obj.speed();

        // vehicle is an abstract so cannot create object of it
        // Car obj = new Vehicles();

    }
}
