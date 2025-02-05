package objectorientedp2;

public class Employee {

    int eid;
    String ename;
    String jobTitle;
    int sal;

    public void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(jobTitle);
        System.out.println(sal);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.eid=1;
        employee1.ename ="Ayon";
        employee1.jobTitle="QA";
        employee1.sal= 100;
        employee1.display();
    }
}
