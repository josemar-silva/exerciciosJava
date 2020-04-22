/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20190319;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class Aula20190319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aula de 19/03/2019"); 
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Digite seu nome");
        x = sc.nextLine();
        System.out.println("O usuario se chama: " + x);
        System.out.println("Qual e a sua Idade?");
        int y;
        y = sc.nextInt();
        System.out.println("A idade do usuario e: " + y + "anos");
        System.out.println("Onde voce nasceu?");
        String z;
        z = sc.nextLine();
        System.out.println("O usuario nasceu em: " + z);
        System.out.println("Em que ano voce nasceu?");
        int i;
        i = sc.nextInt();
        System.out.println("O usuario nesceu em: " + i);
        System.out.println ("Usuario se chama " +  x + " tem " +  y + " Anos " + "Nasceu em " +  z + " No ano de" + i);
                
        
    
    
    
    
    }
    
    
    
}
