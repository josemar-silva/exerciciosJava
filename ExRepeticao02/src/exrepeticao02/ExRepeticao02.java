/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a
senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a 
pedir as informações. 
*/
package exrepeticao02;
import java.util.Scanner;

public class ExRepeticao02 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String usuario;
       String senha;
       boolean senhaValida = false;
       do {
        System.out.println("Digite o nome do usuário; ");
        usuario = sc.next();
        System.out.println("Digite sua senha; ");
        senha = sc.next();
        if (usuario != senha){ 
            senhaValida = true;
            System.out.println("Acesso negado! A senha náo pode ser igual a Usuário");
            System.out.println("Digite o nome do usuário; ");
            usuario = sc.next();
            System.out.println("Digite sua senha; ");
            senha = sc.next();
        } 
       } while (!senhaValida);
       System.out.println("Acesso permitido!");
    }
}
      