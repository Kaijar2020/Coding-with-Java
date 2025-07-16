package codechef.problem;

import java.util.Scanner;

public class SumofArithmeticSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,d,sum=0;
        int n;
        System.out.print("Enter the initial number:- ");
        a= scanner.nextDouble();
        System.out.print("Enter the second element:- ");
        d=scanner.nextDouble();
        System.out.print("Enter the Boundary:- ");
        n=scanner.nextInt();
        for (int i =0; i<n;i++){
            sum=sum+a;
            a=a+d;
        }

        System.out.println(sum);

    }
}

class SumofGfG{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,r,sum=0;
        int n;
        System.out.print("Enter the initial number:- ");
        a= scanner.nextDouble();
        System.out.print("Enter the ratio:- ");
        r=scanner.nextDouble();
        System.out.print("Enter the Boundary:- ");
        n=scanner.nextInt();
        for (int i=0;i<n;i++){
            sum= sum+a;
            a=a*r;
        }
        System.out.println(sum);
    }
}
