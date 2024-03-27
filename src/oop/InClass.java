package oop;

public class InClass extends InClass2 implements I1,I2{

    //This class use to implements I1 and I2 interface

    @Override
    public void m1() {
        System.out.println(x);
    }

    @Override
    public void m2() {
        System.out.println(y);
    }

    public static void main(String[] args) {
        InClass inc = new InClass();
        inc.m1();
        inc.m2();
        inc.m3();
    }
}
