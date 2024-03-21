package dayOne;

public class FindDuplicateinArray {

    public static void main(String[] args) {
        int a[]= {10,50,11,10,10,25,10};
        int target_number = 10;
        int i = 0;
        int count = 0;

        while (i <a.length){
            if(a[i] == target_number){
                count += 1;
            }
            i++;
        }
        System.out.println("The number is appear "+count+" times.");
    }

}
