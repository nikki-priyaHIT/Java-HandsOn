package org.example.Inheritance.MultipleInheritance;

public class Maruti extends Vehicless{
    int milage;
    int wheelCount;
    String seatss;
    boolean airbag;

    Maruti(int milage, int wheelCount, String seatss, boolean airbag){
        this.milage=milage;
        this.wheelCount=wheelCount;
        this.seatss=seatss;
        this.airbag=airbag;
    }

    Maruti(){
        super();
    }

//    @Override
//    void displayVehicless(){
//        System.out.println("Maruti Car has milage of "+milage+" km/h and it has "+seatss+" seats.");
//        System.out.println("It has airbag : "+airbag);
//    }


    public static void main(String[] args) {
        Vehicless obj = new Maruti(500, 4, "five", true);
        obj.displayVehicless();
        Maruti obj1 = new Maruti(700, 4, "Seven", false);
    }
}
