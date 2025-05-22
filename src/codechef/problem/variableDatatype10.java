package codechef.problem;

import java.util.Scanner;

public class variableDatatype10 {

    public static void main(String[] args) {
        int m,n;
        Scanner in = new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        for (int i = m;i<=n ;i++){
            System.out.println(i+"-"+i*i);
        }
    }
}
