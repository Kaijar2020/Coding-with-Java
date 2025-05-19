package java_a2z;

//Valid voter finder program using conditional statement.

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the person age: ");
        age = input.nextInt();

        if (age>= 18){
            System.out.println("This person is a Valid voter");
        }
        else{
            System.out.println("This person is an Invalid voter.");
        }
    }
}
