package java_a2z.oop;

public class Car extends Vehicle{

    int gear;

    Car(String color, double weight, int gear){
        super(color,weight);
        this.gear = gear;
    }

    @Override
    void _display() {
        super._display();
        System.out.println("Gear -> "+gear);
    }
}
