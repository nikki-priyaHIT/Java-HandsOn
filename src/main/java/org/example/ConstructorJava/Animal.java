package org.example.ConstructorJava;

public class Animal {
    int legs;
    String type;
    String name;
    String color;

    Animal(int legs, String type, String name, String color){
        this.legs=legs;
        this.type=type;
        this.name=name;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal obj = new Animal(4, "Dog", "Tommy", "black");
        System.out.println("Here's the details of Animal = "+ obj); // by default reference of any object calls toString();
    }
}


