package codechef.problem;

import java.util.Scanner;

public class JavaSkillContest {
    public static void main(String[] args) {
        System.out.println("I\nlove\nCodeChef");
        String one = "Coding";
        String two = "Chaf";
        two = two.replace('a','e');
        System.out.println(one + " " + two);

        int x=5,y=5;
        if (y>=x){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
class Grade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark;
        for (int i =0 ; i<=3;i++){

                mark = input.nextInt();
                if (mark>90){
                    System.out.println("A");
                }
                else if (mark>70) {
                    System.out.println("B");
                }
                else if (mark>=40) {
                    System.out.println("C");
                }
                else {
                    System.out.println("F");
                }
        }
    }
}

