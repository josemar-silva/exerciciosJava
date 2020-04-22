
package declarandofuncao;

import java.util.Scanner;
import util.calcDesc;

public class DeclarandoFuncao {

    
    public static void main(String[] args) {
       
        calcDesc calc = new calcDesc();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("INFORME O PRECO DO PRODUTO:");
        
        double produto = sc.nextDouble();
        
        double desc = calc.descontoTotal(produto);
    
        System.out.println("O valor do desconto concedido é de: " + desc);
    
    }
    
    
    
    
    
}
