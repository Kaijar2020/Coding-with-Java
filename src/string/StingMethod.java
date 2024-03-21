package string;

import java.util.Arrays;

public class StingMethod {

    public static void main(String[] args) {

        String s = "welcome";

        System.out.println(s.length());
        System.out.println("hello".length());

        //concat() two strings.
        String s1 = "I am";
        String s2 = " Ayon";
        String s3 = " from Bangladesh";
        System.out.println(s1.concat(s2).concat(s3));

        //trim()-- remove space from the right and left side.

        s= "    welcome    ";

        System.out.println(s.trim());

       //charAt() -- returns  a character from a string based on index

       s= "welcome";
        System.out.println(s.charAt(0));

      //contains()
        s= "welcome";
        System.out.println(s.contains("com"));
        System.out.println(s.contains("L"));

        //equals() , equalsIgnoreCase()-- Compare to String.
        s1 = "bye";
        String s0 = "bye";
        s2 = "BYE";
        System.out.println(s1.equals(s0));
        System.out.println(s1.equalsIgnoreCase(s2));

        //replace() -- it will replace single / multiple character in a string.
        s= "welcome to selenium java selenium python selenium C#";
        System.out.println(s.replace('e','x'));
        System.out.println(s.replace("selenium","cypress"));

        //substring -- it will extract substring from the main string.
          s= "welcome";
        System.out.println(s.substring(0,3));

        //toUpperCase() and toLowercase()
        s="SeleNium";
        System.out.println(s.toLowerCase());
        System.out.println("Convert to upper case "+s.toUpperCase());

        //split() --split the string into multiple parts based on delimeter.
        s= "xyz@yahooh.com";
        String a[] = s.split("@");
        System.out.println(Arrays.toString(a));
    }
}
