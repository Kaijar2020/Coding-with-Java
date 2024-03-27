package oop;

 class  Test{
    final int x= 100;

    //final keyword use to make variable value constant.We can not furthure change the value.

    void m(){
        System.out.println("This is method from class Test");
    }
}

class Test1 extends Test{
    void m(){
        System.out.println("This is Method from Test1...");
    }
}

public class FinalKeyword {

    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.x);
        t.m();
    }
}
