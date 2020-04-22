package exFixacao;

import java.util.Scanner;

public class ExFixacaoWhileFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int in = 0;
		int out = 0;
		int n2;

		System.out.println("Informe um numero:");
		n = sc.nextInt();

		for (int x = 1; x <= n; x++) {
			System.out.println("Digite mais um numero:");
			n2 = sc.nextInt();

			if (n2 >= 10 && n2 <= 20) {
				in++;

			} else {
				out++;
			}

		}
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}
