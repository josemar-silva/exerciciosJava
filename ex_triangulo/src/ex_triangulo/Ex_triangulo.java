/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_triangulo;


import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Ex_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int base = 0;
    System.out.println("Digite a medida da base:");
    base = sc.nextInt();
    int altura = 0;
    System.out.println("Digite a medida da altura");
    altura = sc.nextInt();
    int somaDaArea = base*altura/2;
    System.out.println("A area deste triângulo é:" + somaDaArea + "cm");
    
        
        
        // TODO code application logic here
    }
    

}
