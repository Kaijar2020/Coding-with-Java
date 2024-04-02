package wrapperClass;

public class DataConversation {

    public static void main(String[] args) {
        //String to Integear Converstaion.
        String s = "welcome";// Can not convert to int. It should have to numeric value.
        String n = "25896";
        System.out.println(Integer.parseInt(n));

        String s1 = "20";
        String s2 = "30";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        //String to Double Conversation.

        String d1 = "10.05";
        String d2 = "9.55";
        System.out.println(Double.parseDouble(d1)+Double.parseDouble(d2));

        //Int ,double,bool and char to String Conversation.
        int a = 10;
        double d = 20.05;
        boolean b = true;
        char c = 'C';

        //String.valueOf() use to change in String.

        System.out.println(String.valueOf(a));
        System.out.println( String.valueOf(d));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(b));
    }
}
