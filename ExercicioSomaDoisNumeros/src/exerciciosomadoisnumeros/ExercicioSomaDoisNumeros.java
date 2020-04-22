/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosomadoisnumeros;

import java.util.Scanner;

/**
 *
 * @author josemar
 */
public class ExercicioSomaDoisNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner(System.in);
   System.out.println("Esse Exercicio Vai Calcular a Soma entre Dois Numeros");
   System.out.println("Digite um numero de 1 a 100");
   int priNum = 0;
   priNum = sc.nextInt();
   System.out.println("Digite outro numero de 1 a 100");
   int segNum = 0;
   segNum = sc.nextInt();
   int soma = priNum + segNum;
   System.out.println("A soma dos valore " + priNum + " e " + segNum + " é igual a " + soma);
   
   
    }
    
}
