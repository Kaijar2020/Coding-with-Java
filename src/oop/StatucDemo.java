package oop;

public class StatucDemo {

    static int a=10;
    int b=20;

    static  void m1(){
        System.out.println("This is m1 static method..");
    }

    void m2(){
        System.out.println("This is m2 static method..");
    }

    void m(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
    public static void main(String[] args) {
        StatucDemo std = new StatucDemo();
        System.out.println(a);
        m1();
        std.m2();
        std.m1();
        std.m();
    }
}
