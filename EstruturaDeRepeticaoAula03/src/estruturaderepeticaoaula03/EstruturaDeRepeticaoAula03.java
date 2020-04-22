/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepeticaoaula03;
import java.util.Scanner;
public class EstruturaDeRepeticaoAula03 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int senha = 123456;
        int teclado;
        int tentativas = 0;
        for (teclado = 0; teclado != senha; tentativas++){
            if (tentativas == 3){
                System.out.println(" Errou a senha " + tentativas + " vezes! Saindo do Sistema!");
                System.exit(0);
            }
            
            System.out.println("Digite sua Senha: ");
            teclado = sc.nextInt();
            
        }
        System.out.println("Logar no Sistema!");
    }
    
}
