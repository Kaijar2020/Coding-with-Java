package string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "welcome";
        String rev = "";

        for (int i= s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse string is : "+rev);

        //Directly can reverse using StringBuffer.
        StringBuffer p = new StringBuffer("Java");
        System.out.println("Reverse String is "+p.reverse());

        //Directly can reverse using StringBuilder.
        StringBuilder q = new StringBuilder("ayon");
        System.out.println("The Reverse String is :"+q.reverse() );
    }
}
