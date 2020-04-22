/*
 Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a 
população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas 
de crescimento. 
 */
package excrescimentopopulacional;

import java.util.Scanner;

public class ExCrescimentoPopulacional {

    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        double popA, popB, taxaA, taxaB;
        int contAnos = 0;
        
        boolean infVal=false;
        
        do {
            
        System.out.println("entre com o numero da população do país A:");
        popA = scan.nextDouble();
        
        if (popA > 0){
            infVal=true;
            
        } else {
            System.out.println("Informçao invalida! Valor deve ser maior que 0");
        }
        }
        while (!infVal);
        
        infVal=false;
        
        do {
            
        System.out.println("entre com a taxa de crescimento do país A:");
        taxaA = scan.nextDouble();
        
        if (taxaA > 0){
            infVal=true;
            
        } else {
            System.out.println("Informçao invalida! Valor deve ser maior que 0");
        }
        }
        while (!infVal);
            
        do {
            
        System.out.println("entre com o numero da população do país B:");
        popB = scan.nextDouble();
        
        if (popB > 0){
            infVal=true;
            
        } else {
            System.out.println("Informçao invalida! Valor deve ser maior que 0");
        }
        }
        while (!infVal);
        
        infVal=false;
        
        do {
            
        System.out.println("entre com a taxa de crescimento do país B:");
        taxaB = scan.nextDouble();
        
        if (taxaB > 0){
            infVal=true;
            
        } else {
            System.out.println("Informçao invalida! Valor deve ser maior que 0");
        }
        }
        while (!infVal);    
         
        infVal=false;
            
        while (popA < popB) {
            popA += (popA/100)*taxaA;
            popB += (popB/100)*taxaB;
            contAnos++;  
            infVal = true;
            System.out.println("Serão necessário " + contAnos + " anos, para que a população do país 'A' se iguale ou ultrapasse a população do país 'B'");
          
        }
        
       
    }
    
}
