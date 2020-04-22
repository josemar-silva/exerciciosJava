package exFiccacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe o valor da largura e altua do retangulo:");
		System.out.println("Largura:");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Altura:");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("o calculo da área do retangulo é de: " + retangulo.area());
		System.out.println("o calculo do perimetro do retangulo é de: " + retangulo.perimetro());
		System.out.println("o calculo da da diagonal do retangulo é de: " + retangulo.diagonal());
		
		
		
		sc.close();
		
	}

}
