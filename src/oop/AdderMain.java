package oop;

public class AdderMain {

    public static void main(String[] args) {
        Adder add = new Adder();
        add.sum();
        add.sum(12,8);
        add.sum(20.5,45);
        add.sum(12,7.05);
        add.sum(12,8,10);
    }
}
