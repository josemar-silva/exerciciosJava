package exFicacaoNotaAluno;

import java.util.Locale;
import java.util.Scanner;

import notasAluno.Aluno;

public class notasAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String aprovacao;
		double notaMax = 100;
		double media = 60;
		Double resta;
		
		Aluno aluno = new Aluno();
	

		System.out.println("Informe o nome do aluno:");
		aluno.nome = sc.nextLine();

		System.out.println("Informe as notas do aluno nos tres trimentres do ano:");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		if (aluno.NotaFinal() < notaMax && aluno.NotaFinal() < media){
			resta = media - aluno.NotaFinal();
			aprovacao = "REPROVADO!";
			System.out.println("Nota Final: " + aluno.NotaFinal());
			System.out.println(aprovacao);
			System.out.println("Faltam " + resta + " pontos!");
			
		} 
		
		else {
			aprovacao = "APROVADO!";
			System.out.println(aluno.NotaFinal());
			System.out.println(aprovacao);
			
		}

		
		sc.close();
	}

}
