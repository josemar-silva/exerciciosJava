
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String senhaPadrao = "150690";
		String senha;
		int cont = 1;

		System.out.println("Digite sua senha:");
		senha = sc.nextLine();

		while (!senha.equals(senhaPadrao)){

			if (cont < 3) {
				cont++;
				System.out.println("Senha Incorreta!");
				System.out.println("Digite sua senha:");
				senha = sc.nextLine();

			} else {
				System.out.println("Senha Bloqueada!!");
				System.exit(0);
			}

		}

		System.out.println("LOGIN ACEITO!!!");
		System.exit(0);

	}

}
