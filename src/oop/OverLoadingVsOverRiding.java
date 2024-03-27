package oop;

class ABC{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class  XYZ extends ABC{

    void m1(int a){ //This is Over Riding.
        System.out.println(a*a);
    }

    void m2(int a, int b){ //This is Method Over Loading.
        System.out.println(a+b);
    }
}

public class OverLoadingVsOverRiding {

    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        xyz.m1(10);
        xyz.m2(60,40);


        ABC abc = new ABC();
        abc.m1(2);
        abc.m2(23);
    }
}
