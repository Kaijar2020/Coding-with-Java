package oop;

class Parent{
    void display(int a){
        System.out.println(a);
    }
}

class Child1 extends Parent{

    void show(int b){
        System.out.println(b);
    }
}

class Child2 extends Parent{

    void print(int c){
        System.out.println(c);
    }
}

public class HirerarchyInheitance {

    public static void main(String[] args) {

        Child1 ch1 = new Child1();
        ch1.show(12);
        ch1.display(24);
        Child2 ch2 = new Child2();
        ch2.print(6);
        ch2.display(3);
    }
}
