package entradaDeDados;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner (System.in);
		
						
		int n1=sc.nextInt(); //35
		sc.nextLine();
		String name = sc.nextLine(); // Bob marley
		char gender = sc.next().charAt(0); //m
		String s = sc.next(); //B5
		char latter = s.charAt(0); // B
		int digit = Integer.parseInt(s.substring(1)); //5
		double n2 = sc.nextDouble(); //4.32
		String name2=sc.next();
		char gender2=sc.next().charAt(0);
		int n3=sc.nextInt();
		double peso=sc.nextDouble();
		
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(latter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(gender2);
		System.out.println(n3);
		System.out.println(peso);
		
		System.out.println("FINALIZADO COM SUCESSO!!!");

	}

}
