package string;

import java.util.Scanner;

public class StringComparison {

    //Check weather a String is Palindrome or not.

    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        s = sc.next();
        String r = "";

        for (int i = s.length()-1;i>=0;i--){
            r = r+s.charAt(i);
        }

        if( s.equals(r)){
            System.out.println(" This String is palindrome");
        }
        else{
            System.out.println("This String is not palindrome");
        }

    }
}
