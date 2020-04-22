
package exrepeticao01;

import java.util.Scanner;

public class ExRepeticao01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        boolean notaValida = false;
        
        do {
        
        System.out.println("Digite uma Nota entre 0 e 10: ");
        
        double nota = sc.nextDouble();          
        if( nota >=0 && nota <=10){
            notaValida = true;
            System.out.println("Nota Salva!");
            System.exit(0); 
        }else{
            
            System.out.println("Você digitou uma nota inválida! Digite Novamente: !");
        }
    } while (!notaValida);
    
         
}
}
