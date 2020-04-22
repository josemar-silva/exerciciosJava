
package eximpimirmaiornum;

import java.util.Scanner;

public class ExImpimirMaiorNum {

    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        int num;
        int maior = 0;
        
        System.out.println("Digite um aleatoriamente:");
        
        for (int i=0; i<5; i++){
            
        num=sc.nextInt();
        
        if (num > maior){
            maior = num;
        }   
    } System.out.println("O maior numero digitado foi:" + maior);
    }
}
