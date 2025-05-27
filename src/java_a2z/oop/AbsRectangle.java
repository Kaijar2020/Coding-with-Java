package java_a2z.oop;

public class AbsRectangle extends AbstractShape{


    AbsRectangle(double length, double width){
        super(length,width);
    }

    double _areas(){
        return p1*p2;
    }
}
