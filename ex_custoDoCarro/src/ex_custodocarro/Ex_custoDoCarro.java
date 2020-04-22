/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_custodocarro;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Ex_custoDoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hlicaere
        Scanner sc=new Scanner(System.in);
        double custoFabrica = 0;
        System.out.printf("Digite o custo de fábrica:");
        custoFabrica = sc.nextDouble();
        double percDis = custoFabrica / 100*28;
        double impostos = custoFabrica / 100*45;
        double custoFinal = custoFabrica + percDis + impostos;
        System.out.println("O valor final do carro é: R$ " + custoFinal );
        
        
    }
    
}
