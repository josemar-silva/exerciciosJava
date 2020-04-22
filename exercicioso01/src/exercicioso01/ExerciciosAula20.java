package exercicioso01;

import java.util.Scanner;

public class ExerciciosAula20 {
	
	public static void main (String[] args) {
	
		Scanner sc=new Scanner (System.in);
		
					
		System.out.println("Digite um numero aleatorio" );
		int n1 = sc.nextInt();
		
		if (n1 >=0) {
			System.out.println(n1 + " é POSITIVO");
		} else {
			System.out.println(n1 + " é NEGATIVO");
		}
		
		
}

}
