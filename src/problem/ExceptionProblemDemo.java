package problem;

import java.util.Scanner;

public class ExceptionProblemDemo {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag == true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int num1 = scanner.nextInt();
                System.out.print("Please enter num2: ");
                int num2 = scanner.nextInt();
                int result = num1/num2;
                System.out.println("Result:"+num1+"/"+num2+" = "+result);
                flag = false;
            }
            catch (Exception e){
                System.out.println("Exception : "+e);
                System.out.println("You Must Enter integer. Please Try again!");
            }
        }
    }
}
