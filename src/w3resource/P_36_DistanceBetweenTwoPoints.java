package w3resource;

import java.util.Scanner;

public class P_36_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2,y1,y2,result;
        double r = 6371.01;
        System.out.print("Input the latitude of coordinate: ");
        x1 = scanner.nextDouble();
        x1= Math.toRadians(x1);
        System.out.println(x1);
        x2 = scanner.nextDouble();
        x2= Math.toRadians(x2);
        y1 = scanner.nextDouble();
        y1= Math.toRadians(y1);
        y2 = scanner.nextDouble();
        y2= Math.toRadians(y2);
        result = r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.println(result);
    }
}
