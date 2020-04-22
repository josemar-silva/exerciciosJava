/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_cadastrofuncionario;

import java.util.Scanner;

public class Ex_cadastroFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    double salario = 0;
    double descPorDepen = 250.00;
    System.out.println("Qual o valor de seu salario?");
    salario = sc.nextDouble();
    int qntDepen = 0;
    System.out.println("qual a quantidade de dependentes?");
    qntDepen = sc.nextInt();
    if (qntDepen >=1){
    System.out.println("Possui Dependentes");
    double descTotal = descPorDepen*qntDepen;
    double salarioFinal = salario-descTotal;
    System.out.println("Funcionario possui " + qntDepen + " dependente(s), e seu salario é de R$" + salarioFinal);
    } else {
    System.out.println ("Nao possui dependente(s), e seu salario é de R$" + salario);
    

    

    
    
    
    }
    
}
}