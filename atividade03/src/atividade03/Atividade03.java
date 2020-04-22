
package atividade03;

import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salarioAtual, aumento, salarioNovo;
        String porcentual;
        
        System.out.print("Digite o salário autal R$");
        salarioAtual = sc.nextDouble();
        
        if (salarioAtual <= 280) {
            porcentual = "20%";
            aumento = salarioAtual * 0.20;
        } else if (salarioAtual > 280 && salarioAtual < 700) {
            porcentual = "15%";
            aumento = salarioAtual * 0.15;            
        } else if (salarioAtual >= 700 && salarioAtual < 1500) {
            porcentual = "10%";
            aumento = salarioAtual * 0.10;            
        } else {
            porcentual = "5%";
            aumento = salarioAtual * 0.05;
        }
        
        salarioNovo = salarioAtual + aumento;
        
        System.out.println("O salário antes do reajuste era de R$" + salarioAtual);
        System.out.println("O porcentual de aumento foi de " + porcentual);
        System.out.println("O valor do aumento foi de R$" + aumento);
        System.out.println("O novo sálario é de R$" + salarioNovo);
    }
    
}
