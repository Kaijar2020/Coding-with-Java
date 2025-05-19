package java_a2z;

//Logical or assignment.

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        String answer;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you like Jave?");
        System.out.print("--");
        answer = input.next();

        if (answer.contains("y") || answer.contains("Y")){
            System.out.println("You are a java lover");
        }
        if (answer.contains("N") || answer.contains("n")){
            System.out.println("You are not a java lover");
        }
    }
}

//Logical and assignment
class Assignment8{
    public static void main(String[] args) {
        String answer1,answer2;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you Complete your master?");
        System.out.print("--");
        answer1 = input.next();
        System.out.println("Do you fluent in English?");
        System.out.print("--");
        answer2 = input.next();

        if ((answer1.contains("N") || answer1.contains("n")) && (answer2.contains("n") || answer2.contains("N"))){
            System.out.println("Sorry! you are not eligible for the position.");
        }
        else if ((answer1.contains("y") || answer1.contains("Y")) && (answer2.contains("y") || answer2.contains("Y"))) {
            System.out.println("Congratulations! you are welcome to the board.");
        }
        else{
            System.out.println("Sorry! you are not eligible for the position.");
        }
    }
}

//Call center assignment using switch statement.
class  Assignment9{
    public static void main(String[] args) {
        int option;
        Scanner input = new Scanner(System.in);
        System.out.println("Select any options?");
        System.out.print("--");
        option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Selected Language is 'Bengali'");
                break;
            case 2:
                System.out.println("Selected Language is 'French'");
                break;
            case 3:
                System.out.println("Selected Language is 'Urdu'");
                break;
            default:
                System.out.println("Selected Language is 'English'");
                break;
        }
    }
}

//Find sum of 1-10 using for loop.
class Assignment10{
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1;i<=10;i++){
            sum = sum+i;
        }
        System.out.println("Summation of 1-10 is : "+sum);
    }
}

//Find the factorial on n.
class Assignment11{
    public static void main(String[] args) {
        int n, r=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = input.nextInt();

        int i =n;
        while (i>0){
           r=r*i;
           i--;
        }
        System.out.println("The factorila value of "+n+" is "+r);
    }
}

//Print sum of odd number from m-n;
class Assignment12{
    public static void main(String[] args) {
        int strt,end,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        strt = input.nextInt();
        System.out.print("Enter ending number: ");
        end = input.nextInt();
        if (strt<end){
            for (int i =strt; i<=end;i++){
                if (i%2 == 1){
                    sum +=i;
                }
            }
            System.out.println("The summation of "+strt+"-"+end+" is "+sum);
        }
        else{
            System.out.println("The starting number must less than ending number. Try again!");
        }
    }
}

//Find Fibonacci series of nth number.
class Assignment13{
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number: ");
        number = input.nextInt();

        int first = 0, second = 1, fibo;
        System.out.print(first+" "+second);
        int i = 3;
        while(i<=number){
            fibo = first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
            i++;
        }
    }
}