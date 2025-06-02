package file_handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {

        //Create directory/folder.
        File dir = new File("person");
        dir.mkdir();
        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        System.out.println(dir.getName());
        //Create file
        File file = new File("person/ayon.txt");

        try {
            file.createNewFile();
            System.out.println("Files has created.");
        }
        catch (Exception e){
            System.out.println(e);
        }
        file.delete();
        if (dir.delete()){
            System.out.println(dir.getName()+" folder has been deleted.");
        }
    }
}
//Write in the file.
class FileDemo2 {
    public static void main(String[] args) {
        File dir = new File("person");
        dir.mkdir();
        try {
            Formatter formatter = new Formatter("person/ayon.txt");
            formatter.format("%s %s\r\n","101","Ayon");
            formatter.format("%s %s\r\n","102","Akib");

            formatter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
//Read from file.
class FileDemo3{
    public static void main(String[] args) {
        File dir = new File("person");
        try {
            File file = new File("person/ayon.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println(id+" "+name);
            }
            scanner.close();
        }catch (Exception e){
            System.out.println(e);
        }

        if (dir.delete()){
            System.out.println(dir.getName()+" folder has been deleted.");
        }
    }
}