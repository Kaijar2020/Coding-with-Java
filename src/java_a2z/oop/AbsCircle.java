package java_a2z.oop;

public class AbsCircle extends AbstractShape{

    AbsCircle(double radius){
        super(radius,radius);
    }
    double _areas(){
        return Math.PI*p1*p2;
    }
}
