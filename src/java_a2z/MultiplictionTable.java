package java_a2z;

import java.util.Scanner;

public class MultiplictionTable {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(number+"X"+i+" = "+number*i);
        }
    }
}

class RangeMultipliction{

    public static void main(String[] args) {
        int strt,end;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        strt = input.nextInt();
        System.out.print("Enter ending number: ");
        end = input.nextInt();

        for (int i = strt;i<=end; i++){
            for (int j = 1; j<=10; j++){
                System.out.println(i+"X"+j+" = "+i*j);
            }
            System.out.println(" --======================-- ");
        }
    }
}

class primeTest{
    public static void main(String[] args) {
        int strt,end,count=0, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        strt = input.nextInt();
        System.out.print("Enter ending number: ");
        end = input.nextInt();

        for (int i = strt;i<=end; i++){
            for (int j = 2; j<=i-1; j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count ==0){
                total++;
            }
            count=0;
        }
        System.out.println("Total prime number is "+total);
    }
}

//Fibonacci series
class FibonacciTest{
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number: ");
        number = input.nextInt();

        int first = 0, second = 1, fibo;
        System.out.print(first+" "+second);
        for (int i=3;i<=number;i++){
            fibo = first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
        System.out.println();
    }
}
