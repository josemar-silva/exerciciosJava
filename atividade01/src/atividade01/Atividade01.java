package atividade01;

import java.util.Scanner;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salarioBruto;
        
        System.out.print("Digite seu salário bruto: R$");
        salarioBruto = sc.nextDouble();
        
        double ir, sindicato, inss, fgts, salarioLiquido, totalDescontos;
        ir = 0;
        sindicato = salarioBruto * 0.03;
        inss = salarioBruto * 0.10;
        fgts = salarioBruto * 0.11;
        salarioLiquido = salarioBruto - inss - sindicato - ir;
        totalDescontos = inss + sindicato + ir;
        
        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }
            System.out.println("Salário Bruto        : R$" + salarioBruto);
            System.out.println("- IR                 : R$" + ir);
            System.out.println("- INSS               : R$" + inss);
            System.out.println("- Sindicato          : R$" + sindicato);
            System.out.println("- FGTS (11%)          : R$" + fgts);
            System.out.println("- Total de descontos  : R$" + totalDescontos);
            System.out.println("- Salário Líquido     : R$" + salarioLiquido);
        
    }
    
}
