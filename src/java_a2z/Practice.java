package java_a2z;


import java.util.*;

public class Practice {
    //All the practice problem is written in separate class. The class name is denot the problem topics.
}

//Sum of the digit.
class SumofDigit{
    public static void main(String[] args) {
        int number,sum=0,temp,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        temp = number;
        while (temp!=0){
            r= temp % 10;
            sum += r;
            temp = temp / 10;
        }
        System.out.println("The Sum of digit "+number+" is "+sum);
    }
}

//Find Reverse of an integer number
class ReverseDigit{
    public static void main(String[] args) {
        int number,sum=0,temp,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        temp = number;
        while (temp !=0){
            r= temp % 10;
            sum =sum*10+r;
            temp = temp / 10;
        }
        System.out.println("The reverse of the number"+number+" is "+sum);
    }
}

//Find Plaindrome number.
class Palindrome{
    public static void main(String[] args) {
        int number,sum=0,temp,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        temp = number;
        while (temp !=0){
            r= temp % 10;
            sum =sum*10+r;
            temp = temp / 10;
        }
        if (sum == number){
            System.out.println("The number is Plaindrome");
        }
        else {
            System.out.println("The number is not Palindrome.");
        }
    }
}

//Find the number is Armstrong or not.
class ArmStrong{
    public static void main(String[] args) {
        int number,sum=0,temp,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        temp = number;
        while (temp !=0){
            r= temp % 10;
            sum =sum+r*r*r;
            temp = temp / 10;
        }
        if(sum == number){
            System.out.println("The number "+number+" is Armstrong.");
        }
        else {
            System.out.println("The number "+number+" is not an Armstrong.");
        }
    }
}
//Array Demo Practice
class ArrayDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum =0;
        System.out.print("Enter 5 numbers : ");
        for (int i = 0; i<5; i++){
            number[i]=input.nextDouble();
        }

        for (int i =0; i<5; i++){
            sum = sum+number[i];
        }
        //enhance for loop
        for (double n:number){
            System.out.println(n);
        }
        System.out.println("The summation is : "+sum);
    }
}
//Array List.
class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(35);
        number.add(0, 40);
        System.out.println(number);
        System.out.println(number.size());
        number.add(35);

        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        number.add(55);
        number.add(60);

        System.out.println("");
        for (int n : number) {
            System.out.println(number);
        }
        //removing elements
        number.remove(2);
        System.out.println(number);
//        number.clear();
        System.out.println(number.isEmpty());
        System.out.println(number.contains(45));
        System.out.println(number.indexOf(45));

        number.set(3, 25);
        System.out.println(number);
        System.out.println(number.get(3));

       Collections.sort(number);
       System.out.println(number);
       Collections.sort(number,Collections.reverseOrder());
       System.out.println(number);
    }
}
//String Demo-practice string
class StringDemo{
    public static void main(String[] args) {
        String s1 = "kaizar bhai";
        String s2 = new String(" Akib bro");

        System.out.println(s1);
        System.out.println(s2);

        //String length
        System.out.println(s1.length());
        //String Concatination
        System.out.println(s1.concat(s2));
        //WordUpperorLowercase
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String s3 = " I am from Bangladesh.   ";
        System.out.println(s3);
        System.out.println(s3.trim());
        System.out.println(s3.charAt(1));
        System.out.println(s3.codePointAt(3));
        System.out.println(s3.indexOf('m'));
        System.out.println(s3.lastIndexOf('f'));
        //replace character
        System.out.println(s1.replace('k','y'));
        //split space remover
        String[] s4 =s2.split(" ");
        for (String s:s4){
            System.out.println(s);
        }
    }
}
//StringBuffer practice
class StringBufferDemo{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("kaijar");
        System.out.println(sb);

        sb.append(" Akib ");
        sb.append(55);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(10,12));
        sb.setLength(5);
        System.out.println(sb);
    }
}
//String Builder
class StringBuilderDemo{
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Birmingham");
        sbd.append(" City");
        System.out.println(sbd);
    }
}
//Wrapper class in Java
class WrapperDemo{
    public static void main(String[] args) {
        //primitive-object->>autoboxing
        int x = 10;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        //object - primitive ->> unboxing
        double d= new Double(10.25);
        Double e = d;
        System.out.println(e);

        //Convert primitive to string
        int i = 120;
        String s = Integer.toString(i);
        System.out.println(s);
        //Convert string to primitive
        String r = "12";
        int q = Integer.parseInt(r);
        System.out.println(q);
    }
}
//Recursive Method
class Recursive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = input.nextInt();
        System.out.println(fact(x));
    }
    static int fact(int n){
        if (n==1){
            return 1;
        }
        else {
           return n*fact(n-1);
        }
    }
}
//Try-catch-finally block exception handeling
class Exceptionhandeling{
    public static void main(String[] args) {
        try{
            int x= 10,y=0;
            int res = x/y;
            System.out.println("Result: "+res);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("The programe end here..!!");
        }
    }
}