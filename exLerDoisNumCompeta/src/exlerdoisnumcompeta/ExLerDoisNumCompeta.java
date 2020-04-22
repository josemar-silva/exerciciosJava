
package exlerdoisnumcompeta;

import java.util.Scanner;

public class ExLerDoisNumCompeta {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int n1, n2;
        int soma=0;
        System.out.println("Digite dois numeros inteiros:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
       for (int i=n1; i<=n2; i++) {
           soma+=i;
          
       }
        System.out.println(soma);
        
    }
    
}
