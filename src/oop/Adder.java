package oop;

public class Adder {

    //Method Overloading

    int a=10,b=20;

    void sum(){
        System.out.println(a+b);
    }

    void sum(int a ,int b){
        System.out.printf("The sum is : "+(a+b)+"\n");
    }

    void sum(int a ,double b){
        System.out.printf("The sum is : "+(a+b)+"\n");
    }

    void sum(double a , int y){
        System.out.printf("The sum is : "+(a+y)+"\n");
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
