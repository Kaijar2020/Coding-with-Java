package java_a2z.oop;

public class Teacher {

    String name,gender;
    int phone;
    static String institution;
    static {
        institution = "X colleage";
    }

    Teacher(){
        System.out.println("Default constructor");
    }

    Teacher(String n,String g){
        name=n;
        gender = g;
    }

    Teacher(String n,String g,int p){
        name = n;
        gender = g;
        phone = p;
    }
    void display_info(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
    }
    int square(int x){
        return x*x;
    }

    void display(){
        System.out.println("NoN static method");
    }
    static void displayStatic(){
        System.out.println("This is static method.");
    }
}
