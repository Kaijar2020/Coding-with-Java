package oop;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.eid = 01;
        employee1.ename = "Jhon";
        employee1.ejob = "QA";
        employee1.esal = 120;
        employee1.display();

        System.out.println("\n*********\n");

        Employee employee2 = new Employee();
        employee2.eid = 02;
        employee2.ename = "Stephen";
        employee2.ejob = "Dev";
        employee2.esal = 140;
        employee2.display();
    }
}
