/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_mediaidadedaspessoas;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Ex_MediaIdadeDasPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String nome;
       System.out.println("Digite o seu nome:");
       nome = sc.next();
       int idade = 0;
       System.out.println("Digite sua idade:");
       idade = sc.nextInt();
       int dias = 365;
       System.out.println(nome + " voce ja viveu: " + idade*dias);
       
       
       
       
        // TODO code application logic here
    }
    
}
