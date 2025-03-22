package org.example.Inheritance.MultiLevel;

public class KhaitanCompany extends FanCompany {
    int productPrice;
    int electricityConsumption;
    String productType;

    KhaitanCompany(String companyName, String fanType, int price, int productPrice, int electricityConsumption, String productType, int fanHand) {
        super(companyName, fanType, price, fanHand);
        this.productPrice = productPrice;
        this.electricityConsumption = electricityConsumption;
        this.productType = productType;
    }

    void displayKhaitan() {
        System.out.println("Our " + productType + " is very popular.");
    }

    public static void main(String[] args) {
       KhaitanCompany  obj = new KhaitanCompany("Khaitan", "Remote", 2000, 2500, 500, "Electric", 3);
       obj.displayFanCompany();
       obj.displayFan();
       obj.displayKhaitan();
    }
}
