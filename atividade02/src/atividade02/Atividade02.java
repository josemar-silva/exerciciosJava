
package atividade02;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, media;
        char conceito;
        String aprovacao;
        
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = sc.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if (media >= 9 && media <= 10) {
            conceito = 'A';
            aprovacao = "APROVADO!";
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
            aprovacao = "APROVADO!";
        } else if (media >= 6 && media < 7.5){
            conceito = 'C';
            aprovacao = "APROVADO!";
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
            aprovacao = "REPROVADO!";
        } else {
            conceito = 'E';
            aprovacao = "REPROVADO!";
        }
        
            System.out.println("A primeira nota é " + nota1);
            System.out.println("A segunda nota é " + nota2);
            System.out.println("A média é " + media);
            System.out.println("O conceito é " + conceito);
            System.out.println(aprovacao);
    }
    
}
