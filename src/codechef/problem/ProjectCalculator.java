package codechef.problem;

import java.util.Scanner;

public class ProjectCalculator {
     static boolean flag =true;
    public static void main(String[] args) {

         while (flag == true){
             int x = _opt();
             if ( x == 1){
                 System.out.println("Let's performe addition");
                 System.out.println("The sum is: "+_add());
             }
             else if ( x == 2) {
                 System.out.println("Let's performe subtraction");
                 System.out.println("The difference is: "+_sub());
             }
             else{
                 System.out.println("Existing the calculator, bye bye!");
                 flag = false;
             }
         }
    }

    static int _opt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator\n");
        System.out.println("Choose one operation:");
        System.out.println("1. Add\n2. Subtract\n3. Exit");

        System.out.print("Select the operation: ");
        int n = input.nextInt();

        return n;
    }

    static int _sub(){
        Scanner in = new Scanner(System.in);
        System.out.println("Give two numbers on two lines");
        System.out.print("Number 1 is: ");
        int n1 = in.nextInt();
        System.out.print("Number 2 is: ");
        int n2 = in.nextInt();
        return n1-n2;
    }

    static int _add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Give two numbers on two lines");
        System.out.print("Number 1 is: ");
        int n1 = in.nextInt();
        System.out.print("Number 2 is: ");
        int n2 = in.nextInt();
        return n1+n2;
    }
}
