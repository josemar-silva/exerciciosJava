/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02criandoclasses;

/**
 *
 * @author josemar
 */
public class Aula02CriandoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Caneta cp = new Caneta("bic cristal", "preta", 0.5, true, 80);
        
        cp.status();
        cp.destampar();
        cp.escrever();
        
        Caneta cp2 = new Caneta("compactor", "amarela", 0.8, true, 56);
      

        cp2.status();
        cp2.destampar();
        cp2.escrever();
        
        
      
      
    }
    
}

