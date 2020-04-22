
package ex_ferraduras;

import java.util.Scanner;


public class Ex_Ferraduras {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     int numCavalo = 0;
     System.out.println("Quantos cavalos o aras comprou?");
     numCavalo = sc.nextInt();
     int patas = 4;
     int totalPatas = numCavalo * patas;
     System.out.println("Entao serao necessarias " + totalPatas + " ferraduras para equipar todoos os " + numCavalo);
        
    }
    
}
