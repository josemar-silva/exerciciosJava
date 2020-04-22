/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_camisetas;

import java.util.Scanner;
/**
 *
 * @author josemar
 */
public class EX_CAMISETAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    double p = 0;
    System.out.println("Digite a quantidade de camisas tamanho P");
    p = sc.nextDouble();
    double valorUniP = 10.00;
    double totalP = valorUniP*p;
    double m = 0;
    System.out.println("Digite a quantidade de camisas tamanho M");
    m = sc.nextDouble();
    double valorUniM = 12.00;
    double totalM = valorUniM*m;
    double g = 0;
    System.out.println("Dgite a quantidade de camisas tamanho G");
    g = sc.nextDouble();
    double valorUniG = 15.00;
    double totalG = valorUniG*g;
    double totalCompra = totalP+totalM+totalG;
    System.out.println("O VALOR TOTAL DA COMPRA É DE R$ " + totalCompra);
    
    
    
    }

}