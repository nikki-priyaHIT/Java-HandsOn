package org.example.Inheritance.MultiLevel;

public class Fan {
    String fanType;
    int fanHand;

    public Fan(String fanType, int fanHand) {
        this.fanType = fanType;
        this.fanHand = fanHand;
    }

    void displayFan(){
        System.out.println("Fan Type is : "+fanType);
    }

}
