package exFixacaoDoWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		char resposta;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Entre com um numero");

			double n = sc.nextDouble();
			double resultado = Math.sqrt(n);
			System.out.println(resultado);

			System.out.println("Deseja repetir? (y/n)");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');
	}

}
