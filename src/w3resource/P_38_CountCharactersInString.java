package w3resource;

import java.util.Scanner;

public class P_38_CountCharactersInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();
        int l = s.length();
        int letter = 0,space = 0, number = 0, other = 0;
        for (int i = 0; i<l ; i++){
            if (Character.isLetter(ch[i])){
                letter++;
            }
            else if (Character.isDigit(ch[i])) {
                number++;
            }
            else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("letter: "+letter);
        System.out.println("space: "+space);
        System.out.println("number: "+number);
        System.out.println("other: "+other);
    }
}
