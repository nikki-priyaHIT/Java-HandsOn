package org.example.Inheritance.MultiLevel;

public class FanCompany extends Fan {
    String companyName;
    int price;


    FanCompany(String companyName, String fanType, int price) {
        super(fanType, 3); // Assuming default 3 hands for fan
        this.companyName = companyName;
        this.price = price;
    }

    FanCompany() {
        super();
    }

    void displayFanCompany() {
        System.out.println(companyName + " has a product and its " + fanType + " is very popular, but its price is " + price);
    }
}
