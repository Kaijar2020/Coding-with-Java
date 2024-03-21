package dayOne;

import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {

        String s[] = { "scott", "jhon", "arry", "david" };

        System.out.println("Before Sorting String"+ Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting String"+ Arrays.toString(s));
    }
}
