/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Exercicio02 {

  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appli
    System.out.println("Segundo exercicio da aula de 19/03/2019");
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nomeUsuario;
    nomeUsuario = sc.next();
    System.out.println("Digite sua idade:");
    int idadeUsuario = 0;
    idadeUsuario = sc.nextInt();
    System.out.println("O usuario se chama " + nomeUsuario + " e ele tem " + idadeUsuario + " anos");
    
    
    }
    
}
