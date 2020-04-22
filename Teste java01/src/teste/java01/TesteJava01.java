
package teste.java01;

import java.util.Scanner;
 
public class TesteJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = 0;
                System.out.println ("Informe sua Idade");
                    x = sc.nextInt();
                        System.out.println("A idade do usuario e: " + x + "anos");
    }
    
}
