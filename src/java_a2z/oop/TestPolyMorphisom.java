package java_a2z.oop;

public class TestPolyMorphisom {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(1.5,1.5);
        s[2] = new Triangle (4,4);

        for (int i = 0; i<=2 ; i++){
            System.out.println(s[i].area());
        }
    }
}
