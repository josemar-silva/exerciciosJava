
package estruturaderepeticaoaula01;

import java.util.Scanner;

public class EstruturaDeRepeticaoAula01 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int senhaEsp = 123456;
    int senhaCap;
    System.out.print("DIGITE A SENHA: ");
    senhaCap = sc.nextInt();
    while (senhaCap != senhaEsp) {
    System.out.println("Acesso Negado!" + 
            " Informe a senha Correta!");
    senhaCap = sc.nextInt();
    }
    System.out.println("Acesso Permitido!");
    
    
    }
    
}