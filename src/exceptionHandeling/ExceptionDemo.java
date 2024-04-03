package exceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Program Started...");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
//        int num = sc.nextInt();
//
//        System.out.println(100/num); //Arithmatic Exception
/*
        int a[] = new int[5];

        System.out.println("Enter the Position[0-4] : ");
        int pos = sc.nextInt();
        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        a[pos] = value;

        System.out.println(a[pos]);
*//*
        String s= "12345";

        System.out.println(Integer.parseInt(s));*/

        String s = null;
        System.out.println(s.length()); //Null pointer exception.

        System.out.println("Program Completed..");
        System.out.println("Program Exist...");
    }
}
