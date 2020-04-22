
package extabuada;

import java.util.Scanner;

public class ExTabuada {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int num;
        int resultado;
        System.out.println("Entre com o numero para gerar a tabuada:");
        num = sc.nextInt();
        
      for (int i=1; i<=10; i++){
          resultado= num*i;
          System.out.println(num + " * " + i + " = " + resultado);
          
      }
          
    }   
    
}
