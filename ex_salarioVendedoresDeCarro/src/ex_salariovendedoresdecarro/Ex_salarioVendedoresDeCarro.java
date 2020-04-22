/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_salariovendedoresdecarro;

import java.util.Scanner;
/**
 *
 * @author josemar
 */
public class Ex_salarioVendedoresDeCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numCarVend = 0;
        System.out.println("Digite a quantidade de carros vendidos:");
        numCarVend = sc.nextInt();
        double valorComissaoFixaPorCarro = 0;
        System.out.println("Digite o valor da comissao fixa por carro vendido:");
        valorComissaoFixaPorCarro = sc.nextDouble();
        double totalComissaoFixaPorCarro = numCarVend * valorComissaoFixaPorCarro;
        double valorTotalVend = 0;
        System.out.println("Digite o valor total de vendas;");
        valorTotalVend = sc.nextDouble();
        double comissaoSobVendas = valorTotalVend * 0.05;
        double salarioFixo = 0;
        System.out.println("Digite valor do salario fixo;");
        salarioFixo = sc.nextDouble();
        double salarioFinal = totalComissaoFixaPorCarro + comissaoSobVendas + salarioFixo;
        System.out.println("O salario do vendedor sera: R$ " + salarioFinal);
        
        
        
        
        
        
    }
    
}
