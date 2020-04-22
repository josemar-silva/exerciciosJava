
package exsenhaeusuario;

import java.util.Scanner;

class ExSenhaEusuario {

 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        String user;
        String senha;
        boolean infVal = false;
        
        do{
            System.out.println("digite o usuário:");
            user=scan.next();
            System.out.println("digite a senha:");
            senha=scan.next();
            
            if (senha.equalsIgnoreCase(user)){
            System.out.println("Senha invalida! A senha não pode ser igual ao nome de Usuário");
            infVal = false;
            
          } else {
                System.out.println("Login aceito!");
                infVal = true;
            }
        }while (!infVal);
        
    }
        
    }
