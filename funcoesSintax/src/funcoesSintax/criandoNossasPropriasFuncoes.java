package funcoesSintax;

import java.util.Scanner;

public class criandoNossasPropriasFuncoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com tres numeros inteiros:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int higher = max(x, y, z);
		showResult(higher);
		
		System.out.println("Digite tres notas");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		
		int maior = max(n1,n2,n3);

		
		showResult(maior);
	}

	public static int max(int x, int y, int z) {

		int aux;
		if (x >= y && x >= z) {
			aux = x;
		} else if (y >=z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println(value);
	}
	

}

