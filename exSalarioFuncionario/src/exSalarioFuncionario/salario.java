package exSalarioFuncionario;

import java.util.Locale;
import java.util.Scanner;

import entitidade.Folha;

public class salario {
	
	public static void main (String[] args) {
		
		
	Locale.setDefault(Locale.US);
	Scanner sc=new Scanner (System.in);
	
	Folha folha = new Folha();
	
	System.out.println("Informe o nome do funcionario:");
	folha.nome = sc.nextLine();
	
	System.out.println("Informe o salario:");
	folha.salarioBruto = sc.nextDouble();
	
	System.out.println("Informe o valor do imposto a ser descontado:");
	folha.imposto = sc.nextDouble();
	
	System.out.print(folha.nome);
	System.out.println(",  "+folha.SalarioLiquido());
	
	System.out.println("Informe a porcentagem de aumento do salario:");
	double porcentagem = sc.nextDouble();
	folha.aumento(porcentagem);
	
	System.out.print(folha.nome);
	System.out.println(" "+folha.aumento(porcentagem));
	
	sc.close();
	}
}
