package org.example.Interface;

interface Animals {
   // int legs; --> cannot do like this it must be initialised and it will be final by default
    // String color; --> Must be initialized

    int legs = 4;
    String color = "brown";
    String type = "Amphibian";

    void animalType();
    void breed();
}
