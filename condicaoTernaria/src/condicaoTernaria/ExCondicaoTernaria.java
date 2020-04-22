package condicaoTernaria;


import java.util.Scanner;

public class ExCondicaoTernaria {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner (System.in);
		
		double nota;
		String avaliacao;
		
		System.out.println("Entre com a nota do aluno:");
		nota = sc.nextDouble();
		
		avaliacao =(nota >= 7) ? "APROVADO!" : "REPROVADO!";
		sc.close();
		
		System.out.println("Resultado: " + avaliacao);
		
		
	}
}
