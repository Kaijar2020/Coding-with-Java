package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Declaration of Array list

        //ex-01
        ArrayList myList = new ArrayList();

//        //ex-02
//        List list = new ArrayList();
//
//        //ex-03 if only store same type of data.
//        ArrayList<Integer> aint = new ArrayList<Integer>();


        //Adding data into the ArrayList
        myList.add(100);
        myList.add(10.05);
        myList.add("hello");
        myList.add('Z');
        myList.add(true);
        myList.add(null);

        //Size of Array List
        System.out.println(myList.size());

        //Printing Array List
        System.out.println("Printing Array List : "+myList);

        //Remove element from Array List
        myList.remove(4);

        System.out.println("Printing Array List : "+myList);

        //Inser element in the ArrayList
        myList.add(2,"Java");
        System.out.println("Printing Array List : "+myList);

        //Modify List
        myList.set(2,"js");
        System.out.println("Printing Array List : "+myList);

        //Access specific element
        System.out.println(myList.get(3));

        //Readiing all the element from Array List
           //using for loop
        for (int i =0;i<myList.size();i++ ){
            System.out.println(myList.get(i));
        }

        System.out.println("using for each");
            //using for-each loop
        for (Object x:myList){
            System.out.println(x);
        }

        System.out.println("Using iterator");
            //using iteretor*

        Iterator it = myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Checking ArrayList is empty or not
        System.out.println("Is My List empty : "+myList.isEmpty());

        //remove all the element from list
        myList.clear();
        System.out.println(myList.isEmpty());

    }
}
