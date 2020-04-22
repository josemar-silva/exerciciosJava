package aulaEntradaEsaidaNoEstoque;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		
		Product product = new Product();
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		
		product.price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		System.out.println();
		
		System.out.println(product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock");
		int quantityIn = sc.nextInt();
		product.addProducts(quantityIn);
		
		System.out.println(product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		int quantityExit = sc.nextInt();
		product.removeProducts(quantityExit);
		
		System.out.println(product);
		
		sc.close();
		
	}

}
