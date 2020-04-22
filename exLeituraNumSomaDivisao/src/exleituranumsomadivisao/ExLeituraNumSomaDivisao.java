
package exleituranumsomadivisao;

import java.util.Scanner;

public class ExLeituraNumSomaDivisao {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n1, n2, n3, n4, n5;
        
        System.out.println(" Digite 5 numeros aleatoios:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        n5=sc.nextInt();
        int soma = n1+n2+n3+n4+n5;
        double divisao= (n1+n2+n3+n4+n5) /5;
        System.out.println("A soma de " + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + " é igual: " + soma);
        System.out.println("A media da soma de " + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + " é igual: " + divisao);
        
    }
    
}
