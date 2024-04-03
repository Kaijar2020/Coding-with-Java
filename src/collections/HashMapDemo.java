package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        //Adding pairs
        hm.put(101,"josh");
        hm.put(101,"joe");//Key should not be duplicate. duplicate key not allowed.
        hm.put(102,"joel");
        hm.put(103,"yushi");
        hm.put(104,"josh"); //value can duplicate.

        System.out.println(hm);

        System.out.println(hm.size());
        //remove pair
        hm.remove(102);
        System.out.println(hm);

        //access value of the particular key
        System.out.println(hm.get(104));
        //get all the keys

        System.out.println(hm.keySet());
        //get all the values only

        System.out.println(hm.values());

        //get all the hash map in set format
        System.out.println(hm.entrySet());

        //Reading Data from HashMap
          //using for each
        for (int k:hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
            //using Iterator



    }
}
