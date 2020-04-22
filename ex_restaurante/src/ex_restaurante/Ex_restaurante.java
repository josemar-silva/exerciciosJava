/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_restaurante;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Ex_restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("RESTAURANTE BEM BÃO");
    double precoQuilo = 12.00;
    double pesoPrato = 0;
    double taraPrato = 0.400;
    System.out.println(" DIGITE O PESO DO PRATO ");
    pesoPrato = sc.nextDouble();
    double pesoPratoFinal = pesoPrato - taraPrato;
    double valorApagar = pesoPratoFinal*precoQuilo;
    System.out.println(" O VALOR A SER PAGO É DE R$ " + valorApagar);
                              
        
        // TODO code application logic here
            }
}
