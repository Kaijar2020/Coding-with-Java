package java_a2z;

import java.util.Scanner;

public class Assignment4 {
// Calculate the Number of installment of a Product.

    public static void main(String[] args) {

        int productPrice;
        int tenurePeriods;
        int installmentPerMonth;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the prodcut price -> ");
        productPrice = input.nextInt();
        System.out.println("Enter Tenure Periods -> ");
        tenurePeriods = input.nextInt();
        installmentPerMonth = _monthlyInstallment(productPrice,tenurePeriods);
        System.out.println("Monthly Installment is "+installmentPerMonth+" BDT."+" And total tenure is "+tenurePeriods+" Months.");
    }

    public static  int _monthlyInstallment(int param1 , int param2){
        int result = (param1/param2);
        return result;
    }
}
//String Palindrome Problem --Soluation
class StringPlaindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input -->> ");
        String s = input.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        String inv_s = s1.reverse().toString();
        if (s.equals(inv_s)){
            System.out.println("This String is palindrome.");
        }
        else {
            System.out.println("This is not palindrome.");
        }
    }
}
