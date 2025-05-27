package java_a2z.oop;

public class AbsTest {
    public static void main(String[] args) {
        AbstractShape abstractShape;
        abstractShape = new AbsRectangle(5,5);
        System.out.println(abstractShape._areas());

        abstractShape = new AbsTriangle(10.5,5.3);
        System.out.println(abstractShape._areas());

        abstractShape = new AbsCircle(10);
        System.out.println(abstractShape._areas());
    }
}
