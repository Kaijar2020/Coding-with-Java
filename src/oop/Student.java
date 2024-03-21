package oop;

public class Student {

    int sid;
    String sname;
    char grade;

    void displayStudentData(){

        System.out.println(sid+" "+sname+" "+grade);
    }

    void setStudentData(int id, String name, char grd){
        sid=id;
        sname = name;
        grade = grd;
    }

    //using Constructor

    Student(int id, String name, char grd){
        sid=id;
        sname = name;
        grade = grd;
    }
}
