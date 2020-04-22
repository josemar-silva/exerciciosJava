/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_booleanaidade;

import java.util.Scanner;

/**
 *
 * @author Josemar Silva
 */
public class EX_BooleanaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc= new Scanner(System.in);
    int idade = 0;    
    System.out.println("Informe sua idade:");
    idade= sc.nextInt();
    if (idade>=18){
    System.out.println("Pode ser Cadastrado");
    }
    else {
    System.out.println("Nao pode ser cadastrado");
    }
    }
    }
