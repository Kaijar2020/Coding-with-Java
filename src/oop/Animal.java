package oop;
 //Practicing super keywords.
public class Animal {

    String color = "white";

    void eat(){
        System.out.println("Eating;;;;;;;;;;;");
    }
}

class Dog extends Animal{
    String color = "black";

    void eat(){
        System.out.println("eating meat'''''''''");
        super.eat();
    }

    void display(){
        System.out.println(super.color); //here super class invoke the immidiate parents class variable instead of black.

    }
}
