/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_media.asidades;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Ex_mediaAsidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String priNome;
    System.out.println("1ª Pessoa"
            + " Digite seu nome:");
    priNome = sc.next();
    int priIdade = 0;
    System.out.println( priNome + " Digite a sua idade:");
    priIdade = sc.nextInt();
    String segNome;
    System.out.println("2ª Pessoa"
            + " Digite seu nome:");
    segNome = sc.next();
    int segIdade = 0;
    System.out.println( segNome + " Digite a sua idade:");
    segIdade = sc.nextInt();
    String terNome;
    System.out.println("3ª Pessoa"
            + " Digite seu nome");
    terNome = sc.next();
    int terIdade = 0;
    System.out.println( terNome + " Digite sua idade:");
    terIdade = sc.nextInt();
    String quaNome;
    System.out.println("4ª Pessoa"
            + " Digite seu nome:");
    quaNome = sc.next();
    int quaIdade = 0;
    System.out.println( quaNome + " Digite sua idade:");
    quaIdade = sc.nextInt();
    int somaIdade = priIdade + segIdade + terIdade + quaIdade;
    float mediaIdade = somaIdade/4;
    System.out.println("A MÉDIA ARITIMETICA DAS IDADES DE " + priNome + "," + segNome + "," + terNome + " E " + quaNome + " É DE: " + mediaIdade + " ANOS");
    
    
        // TODO code application logic here
    }
    
}
