package java_a2z.oop;

public class Triangle extends Shape{

    double height, base;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5*base*height;
    }
}
