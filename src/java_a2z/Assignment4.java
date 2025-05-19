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
