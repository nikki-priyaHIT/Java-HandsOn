package org.example.Interface;

public class SubAnimalInterface implements Animals {

    @Override
    public void animalType(){
        System.out.println("It is an amphibian");
    }

    @Override
    public void breed() {
        System.out.println("It is a Dolphin");
    }

    public static void main(String[] args) {
        Animals obj = new SubAnimalInterface();
        SubAnimalInterface obj2 = new SubAnimalInterface();
        obj.animalType();
        obj2.breed();
        obj.breed();
        obj2.animalType();

    }
}
