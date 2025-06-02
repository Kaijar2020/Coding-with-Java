package java_a2z;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> customer = new HashMap<Integer, String>();

        customer.put(1001,"Ayon");
        customer.put(1002,"Akib");
        customer.put(1003,"Asif");

        System.out.println(customer.get(1002));
    }
}

//HasSet Demo
class HashSetDemo{

    public static void main(String[] args) {
        HashSet<String> fruitsname = new HashSet<String>();

        fruitsname.add("Orange");
        fruitsname.add("Lichi");
        fruitsname.add("Apple");

        System.out.println(fruitsname);
        System.out.println(fruitsname.size());
        fruitsname.remove("Lichi");
        System.out.println(fruitsname);
        System.out.println(fruitsname.isEmpty());
        fruitsname.clear();
        System.out.println(fruitsname.isEmpty());
    }
}
