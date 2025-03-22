package org.example.Inheritance.MultiLevel;

public class KhaitanCompany extends FanCompany {
    int productPrice;
    int electricityConsumption;
    String productType;

    KhaitanCompany(String companyName, String fanType, int price, int productPrice, int electricityConsumption, String productType) {
        super(companyName, fanType, price);
        this.productPrice = productPrice;
        this.electricityConsumption = electricityConsumption;
        this.productType = productType;
    }

    KhaitanCompany() {
        super();
    }

    void displayKhaitan() {
        System.out.println("Our " + productType + " is very popular.");
    }

    public static void main(String[] args) {

        FanCompany obj = new KhaitanCompany("Khaitan", "Stand Fan", 1500, 1500, 1200, "Stand Fan");
        Fan obj1 = new FanCompany("Khaitan", "Hand Fan", 2500);
        KhaitanCompany obj2 = new KhaitanCompany("Khaitan", "Remote Fan", 2000, 2000, 450, "Remote Fan");

        obj.displayFanCompany();
        obj.displayFan();
        obj2.displayKhaitan();
        obj1.displayFan();
        obj2.displayFanCompany();
    }
}
