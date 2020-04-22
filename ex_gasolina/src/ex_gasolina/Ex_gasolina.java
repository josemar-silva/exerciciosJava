/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_gasolina;

import java.util.Scanner;

public class Ex_gasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    double valorDaGasolina = 0;
    System.out.println("Digite o valor do Litro da Gasolina:");
    valorDaGasolina = sc.nextDouble();
    double valorAbastecido = 0;
    System.out.println("Digite o valor a ser abastecido:");
    valorAbastecido = sc.nextDouble();
    double litrosAbastecidos = valorAbastecido / valorDaGasolina;
    System.out.printf(" O valor do litro da Gsolina é de R$" + valorDaGasolina + " ,e com R$" + valorAbastecido + " voce abasteceu %.3f ", litrosAbastecidos );
    
    
   
    
         
    
        
    }
    
}
