package problem;

public class Box {

    double height,width,depth;

    Box(double height, double w,double d){
        this.height=height;
        width = w;
        depth = d;
    }

    void displayVol(){
        double v = height*width*depth;
        System.out.println("The Box volume: "+v);
    }
}
