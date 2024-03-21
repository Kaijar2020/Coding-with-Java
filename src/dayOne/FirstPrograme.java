package dayOne;

import java.sql.SQLOutput;

public class FirstPrograme {

    public static void main(String[] args) {

       int[] a =  {100,500,900,200,400};
       int Search_element = 50;
       boolean status = false;

       for(int i = 0; i<a.length; i++){
           if(a[i] == Search_element){
               System.out.println(Search_element+" The Element is found at the Position "+i);
               status = true;
               break;
           }
       }
       if(!status){
           System.out.println("The Elemetn is not found.");
       }

    }
}
