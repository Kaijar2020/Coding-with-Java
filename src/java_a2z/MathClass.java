package java_a2z;

public class MathClass {

    public static void main(String[] args) {
        int x= 10;
        int y= 2;
        float z = 25.5f;

        System.out.println(Math.max(x,y));
        System.out.println(Math.addExact(x,y));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.round(z));
        System.out.println(Math.random());
        System.out.println(Math.log10(x));
        System.out.println(Math.cbrt(x));
        System.out.println(Math.ceil(z));
        System.out.println(Math.floor(z));
        System.out.println(Math.subtractExact(x,y));
        System.out.println(Math.subtractExact(y,x));
        System.out.println(Math.incrementExact(y));
        System.out.println(Math.PI);
    }
}
