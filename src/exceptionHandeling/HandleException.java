package exceptionHandeling;

import java.util.Scanner;

public class HandleException {

    public static void main(String[] args) {
        System.out.println("Program Started .....");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        try {
            System.out.println(100/num); //Arithmatic Exception.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
