package java_a2z.oop;

public abstract class AbstractShape {

    double p1,p2;
    AbstractShape(double p1, double p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    abstract double _areas();
}
