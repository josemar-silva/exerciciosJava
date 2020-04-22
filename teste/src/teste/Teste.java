/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author Josemar Silva
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
String nome;
int idade, anoNasc;
System.out.println("DIDITE DEU NOME: ");
nome = sc.next();
System.out.println("DIDITE O ANO DE NASCIMENTO");
anoNasc = sc.nextInt();
idade = 2019 - anoNasc;
System.out.println("Seu nome é: " + nome + "Você nasceu em; " + anoNasc + " e sua idade é:" + idade);

    }
    
}
