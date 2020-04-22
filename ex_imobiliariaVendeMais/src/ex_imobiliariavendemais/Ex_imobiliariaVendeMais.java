
package ex_imobiliariavendemais;

import java.util.Scanner;


public class Ex_imobiliariaVendeMais {

    public static void main(String[] args) {
    
        System.out.println("Esse exercicio vai calcular a area de um determinado terreno");
        Scanner sc = new Scanner(System.in);
        int largura = 0;
        System.out.println("Digite e largura do terreno: ");
        largura = sc.nextInt();
        int comprimento = 0;
        System.out.println("Digite o cumprimento do terreno: ");
        comprimento = sc.nextInt();
        int somaDaArea = largura * comprimento;
        System.out.println ("A soma da area do terrreno é: " + somaDaArea + " M²");
        
        
        
        
        
    }
    
}
