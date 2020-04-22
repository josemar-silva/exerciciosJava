package aplication;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        name = sc.next();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();

        Product info = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + info);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        info.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + info);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        info.removeProducts(quantity);
        System.out.println();
        System.out.println(info.getName());
        System.out.println(info.getPrice());
        System.out.println(info.getQuantity());

        sc.close();

    }

}
