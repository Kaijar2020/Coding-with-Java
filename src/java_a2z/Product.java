package java_a2z;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int id;
        String title;
        String price;
        String description;
        String category;

        System.out.print("Enter the id -> ");
        id = input.nextInt();
        System.out.println("Enter the title -> ");
        title = input.next();
        System.out.print("Enter the Price -> ");
        price = input.next();
        System.out.print("Enter the Description -> ");
        description = input.next();
        System.out.print("Enter Category Name -> ");
        category = input.next();

        System.out.println("Id: "+id);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Description: "+description);
        System.out.println("Category: "+category);
    }
}
