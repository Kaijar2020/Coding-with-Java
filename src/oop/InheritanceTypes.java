package oop;


class  A{

    int a;
    void display(){
        System.out.println(a);
    }
}

class B extends A{
    int b;
    void print(){
        System.out.println(b);
        System.out.println(a);
    }
}

class C extends B{
    int c;

    void show(){
        System.out.println(c);
    }
}

public class InheritanceTypes {

    public static void main(String[] args) {
//        B b= new B();
//        System.out.println(b.a);
//        b.display();
//        b.print();

        C c = new C();
        c.a=100;
        c.b=200;
        c.c =300;
        c.show();
        c.display();
        c.print();

    }
}
