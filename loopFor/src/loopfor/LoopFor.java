
package loopfor;

import java.util.Scanner;

public class LoopFor {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        boolean nomeValido = false;
        System.out.println("Digite meu nome;");
        String nome = sc.next();
    for (String meuNome = "josemar"; nome.equalsIgnoreCase(meuNome); nome=sc.next()){
        
        System.out.println("meu nome é: " + nome);
    }
        
    }
}