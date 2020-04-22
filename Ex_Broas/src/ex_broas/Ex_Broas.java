/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_broas;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Ex_Broas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double paes = 0;
        System.out.println("quantidade de paes vendidos: ");
        paes = sc.nextDouble();
       double broas = 0;
        System.out.println("quantidade de broas vendidas: ");
        broas = sc.nextDouble();
        double valordepaes = paes * 0.12;
        double valordasbroas = broas * 1.50;
        double valortotaldevendas = (int) (valordepaes + valordasbroas);
        System.out.println("O valor total das vendas e: " + valortotaldevendas + " e o valor a ser depositado e de: " + valortotaldevendas * 0.1);
        
        
        
        
        
        
        
       
        
        
        
        
    }
    
}
