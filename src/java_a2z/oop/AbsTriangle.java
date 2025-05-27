package java_a2z.oop;

public class AbsTriangle extends AbstractShape{


    AbsTriangle(double base, double height){
        super(base,height);
    }

    @Override
    double _areas() {
        return 0.5*p1*p2;
    }
}
