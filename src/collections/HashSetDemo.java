package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        //Declaration
        HashSet mySet = new HashSet();

        mySet.add(100);
        mySet.add(20.5);
        mySet.add(100);
        mySet.add("hello");
        mySet.add(null);
        mySet.add(null);//not allowed duplicate.

        System.out.println(mySet);

        //Removing Element
        mySet.remove(20.5);
        System.out.println(mySet);

        //Insertion -- is not possible.
        //Convert Hasset-->Array List
        ArrayList al = new ArrayList(mySet);
        System.out.println(al);
        System.out.println(al.get(2));

        //Read all the element using for each
        for (Object x:mySet){
            System.out.println(x);
        }
        //using iterator
        Iterator <Object> it = mySet.iterator();
        while (it.hasNext()){
            System.out.println("Using Iterator : "+it.next());
        }

    }
}
