
package ex_imprimenummaior;

import java.util.Scanner;


public class Ex_imprimeNumMaior {


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int priNum = 0;
int segNum = 0;
System.out.println("Digite um número:");
priNum = sc.nextInt();
System.out.println("Digite outro número:");
segNum = sc.nextInt();
if (priNum > segNum){
System.out.println("O maoir número digitado foi: " + priNum);
} else {
System.out.println ("O maior número digitado foi: " + segNum);
        
    }
    
}
}