/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_condicaounica;

import java.util.Scanner;

public class Ex_condicaoUnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    int anoCarro = 0;
    System.out.println("Qual ano do seu carro?");
    anoCarro = sc.nextInt();
    if(anoCarro >=2009 ){
    System.out.println("Ok! Cadastro para Motorista Aceito");
    } else {
    System.out.println("Cadastro para Motorista nao Aceito");
    }
    
}
}