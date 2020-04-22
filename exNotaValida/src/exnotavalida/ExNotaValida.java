/*
 Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo 
até que o usuário informe um valor válido. */

package exnotavalida;

import java.util.Scanner;

public class ExNotaValida {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        double nota;
        boolean notaVal = false;
        
             
        do {
             System.out.println("Digite uma nota entre 0 e 10:");
             nota=sc.nextDouble();
        
        if (nota >=0 && nota <=10){
            notaVal = true;
            System.out.println("Nota Salva!");
        }else{
            System.out.println("Nota invalida, digite uma nota valida:");
        } 
        }
        while (!notaVal);
            
        
            
        }   
            
    }  
    


