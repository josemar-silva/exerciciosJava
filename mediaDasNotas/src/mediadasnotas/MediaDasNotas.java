
package mediadasnotas;

    import java.util.Scanner;

public class MediaDasNotas {

    
    public static void main(String[] args) {
    
    Scanner sc=new Scanner (System.in);
    int priNota = 0;
    System.out.println("Digite a primeira nota");
    priNota = sc.nextInt();
    int segNota = 0;
    System.out.println("Digite a segunda nota");
    segNota = sc.nextInt();
    double media = priNota + segNota; 
    double mediaFinal = media/2;
    if (mediaFinal >= 7 && mediaFinal <10){
    System.out.println("A média das notas é " + mediaFinal + ", Aprovado!");
    }
    if (mediaFinal < 7){
    System.out.println("A média das notas é " + mediaFinal + ", Reprovado!");
    }
    if (mediaFinal >=10){ 
    System.out.println("A média das notas é " + mediaFinal + ", Aprivado com Distinção");
    }
    
    
    } 
    
    
}
