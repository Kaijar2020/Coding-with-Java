package java_a2z;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Armania");
        countryNames.add("Bangladesh");
        countryNames.add("Canada");
        countryNames.add("Denmark");
        countryNames.add(4,"England");
        countryNames.addFirst("Austria");
        countryNames.addLast("Zimbabwe");
        countryNames.remove();

        System.out.println(countryNames);
        for (String cn :countryNames){
            System.out.print(cn+" ");
        }
        System.out.println("\n"+countryNames.size());
        System.out.println(countryNames.getFirst());
        countryNames.clear();
        System.out.println(countryNames);
    }
}
//Practice linkedlist in real world problem.
class Student{
    String name,className;
    int id;
    Student(String name,String className,int id){
        this.name = name;
        this.className = className;
        this.id = id;
    }
}

class StudentListDemo{
    public static void main(String[] args) {
       LinkedList<Student> studentList = new LinkedList<Student>(); //made list of student
       Student student1 = new Student("Jawad","Eleven",1001);
       Student student2 = new Student("Mask","Twelve",1002);
       Student student3 = new Student("Gates","Twelve",1003);
       Student student4 = new Student("Jobs","Eleven",1004);

       studentList.add(student1);
       studentList.add(student2);
       studentList.add(student3);
       studentList.add(student4);

       for (Student s:studentList){
           System.out.println(s.id+" "+s.name+" "+s.className+" ");
       }
    }
}
