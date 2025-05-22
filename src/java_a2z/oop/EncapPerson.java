package java_a2z.oop;

public class EncapPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Finn");
        p.setAge(16);
        System.out.println(p.getName() +" and "+p.getAge());
    }
}
