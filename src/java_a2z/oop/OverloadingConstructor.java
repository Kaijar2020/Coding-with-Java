package java_a2z.oop;

public class OverloadingConstructor {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Thomas","Male");
        teacher2.display_info();
        Teacher teacher3 = new Teacher("Jhon","Male",01474741);
        teacher3.display_info();
        System.out.println(teacher1.square(5));
        System.out.println(Teacher.institution); //no need to make object to access static element.
        teacher3.display();
        Teacher.displayStatic();
    }
}
