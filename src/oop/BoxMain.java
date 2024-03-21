package oop;

public class BoxMain {

    public static void main(String[] args) {
        Box box = new Box(10.5,15.5,5.0);
        Box b = new Box(10.09);
        System.out.println(box.volume());
        System.out.println(b.volume());
    }
}
