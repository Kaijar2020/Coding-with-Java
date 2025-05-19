package java_a2z;

//Digit spelling program using conditional statement.

import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the digit: ");
        digit = input.nextInt();

        if (digit == 0){
            System.out.println("The spelling of 0 is 'Zero'.");
        }
        else if (digit ==1) {
            System.out.println("The spelling of 1 is 'One'.");
        }
        else if (digit ==2) {
            System.out.println("The spelling of 2 is 'Two'.");
        }
        else if (digit ==3) {
            System.out.println("The spelling of 3 is 'Three'.");
        }
        else if (digit ==4) {
            System.out.println("The spelling of 4 is 'Four'.");
        }
        else if (digit ==5) {
            System.out.println("The spelling of 5 is 'Five'.");
        }
        else if (digit ==6) {
            System.out.println("The spelling of 6 is 'Six'.");
        }
        else if (digit ==7) {
            System.out.println("The spelling of 7 is 'Seven'.");
        }
        else if (digit ==8) {
            System.out.println("The spelling of 8 is 'Eight'.");
        }
        else if (digit ==9) {
            System.out.println("The spelling of 9 is 'Nine'.");
        }
        else {
            System.out.println("This is Inavlid input. Please insert the digit between [0-9].");
        }
    }
}
