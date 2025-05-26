package java_a2z.oop;

public class Vehicle {

    String color;
    double weight;

    Vehicle(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    void _display(){
        System.out.println("Color -> "+color);
        System.out.println("Weight -> "+weight);
    }
}
