package dayOne;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseanArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int r[] = new int[5];
        for (int i=0;i<a.length;i++){

            System.out.print("Enter a value "+i+": ");
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

        System.out.println("The Reverse array is : ");
        for (int i = a.length-1;i<=0;i--){
            //
        }
        System.out.println(Arrays.toString(r));
    }
}
