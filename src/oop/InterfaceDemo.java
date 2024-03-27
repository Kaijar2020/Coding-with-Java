package oop;

interface Shape{

    int length = 10;
    int width = 20;

    void circle(); //abstract metnod

    default void square(){
        System.out.println("This is default method..");
    }

    static void rectangle(){
        System.out.println("This is Satatic method..");
    }
}
public class InterfaceDemo implements Shape{

    @Override
    public void circle(){
        System.out.println("This is circle --Abstract method");
    }

    void triangle(){
        System.out.println("This is Triangle...");
    }

    int x=10,y=20;
    public static void main(String[] args) {
        // Scenario 1
        InterfaceDemo ind = new InterfaceDemo();
        ind.circle();
        ind.square();
        Shape.rectangle(); //Static method can directly access from interface.
        ind.triangle();
        System.out.println(ind.x+ind.y);


        //Scenario 2
        Shape sh = new InterfaceDemo();
        sh.circle(); //abstract
        sh.square(); //default
        Shape.rectangle();
        System.out.println(Shape.length * Shape.width); //access static variable directly.


    }
}
