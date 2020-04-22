
package ex_numpositivonegativo;

import java.util.Scanner;

public class Ex_numPositivoNegativo {


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número aleatoriamente:");
        num = sc.nextInt();
        if (num >=0){
        System.out.println("O número escolhido foi: " + num + "`e ele é um número Positivo!");
        }else{
        System.out.println ("O número escolhido foi:" + num + " e ele é um número Negativo!");
        
    }
        
        
    }
    
}
