package exEntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter your full name:");
		String name=sc.nextLine();
		System.out.println("How many bedrooms are in your house?");
		int bedrooms=sc.nextInt();
		System.out.println("Enter product price:");
		double product=sc.nextDouble();
		System.out.println("Enter your last name, age and height(same line):");
		String lastName=sc.next();
		int age=sc.nextInt();
		double height=sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", product);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%2f%n", height);
		
		sc.close();
		
		
	}

}
