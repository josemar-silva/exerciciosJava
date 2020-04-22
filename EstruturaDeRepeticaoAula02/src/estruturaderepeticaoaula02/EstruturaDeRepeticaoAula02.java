/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepeticaoaula02;
import java.util.Scanner;
/**
 *
 * @author Josemar Silva
 */
public class EstruturaDeRepeticaoAula02 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int senhaEsp = 123456;
    int senhaCap;
    int contador = 1;
        System.out.print("DIGITE A SENHA: ");
    senhaCap = sc.nextInt();
    while (senhaCap != senhaEsp) {
        System.out.println("Acesso Negado!" + " Informe a senha Correta!");
    senhaCap = sc.nextInt();
    contador +=1;
    if (contador == 3){
        System.out.println("Acesso Negado! Saindo do sistema!");
        System.exit(0);
    }
    }
        System.out.println("Acesso Permitido!");
        // TODO code application logic here
    }
    
}
