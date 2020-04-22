
package exdadospessoaisvalidos;

import java.util.Scanner;

public class ExDadosPessoaisValidos {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String nome, sexo, estadoCivil;
        double salario;
        int idade;
        
        boolean infVal = false;
        
        do {
            System.out.println("Digite o nome:");
            nome=sc.nextLine();
            
            if (nome.length() >=3){
             infVal = true;
    }       else {
                System.out.println("Nome deve ter no minimo 3 caractéres!");
             }
        }
        while(!infVal);
        
        infVal = false;
        
        do {
            System.out.println("Digite a idade:");
            idade=sc.nextInt();
            
            if (idade > 0 && idade <=150){
             infVal = true;
    }       else {
                System.out.println("A idade deve ser maior que '0' e menor que '150'! ");
             }
        }
        while(!infVal);
        
         infVal = false;
        
        do {
            System.out.println("Digite o salário:");
            salario=sc.nextDouble();
            
            if (salario > 0){
             infVal = true;
    }       else {
                System.out.println("O valor do salário dever ser maior que '0'!");
             }
        }
        while(!infVal);
        
        infVal = false;
        
        do {
            System.out.println("Digite o sexo 'F' para feminino e 'M' para masculino ou 'O' para Outros:");
            sexo=sc.next();
            
            if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("o")){
             infVal = true;
    }       else {
                System.out.println("O sexo deve ser igual a 'F', 'M' ou 'O'!");
             }
        }
        while(!infVal);
        
        infVal = false;
        
        do {
            System.out.println("Digite o estado civil:");
            estadoCivil=sc.next();
            
            if (estadoCivil.equalsIgnoreCase("s")||estadoCivil.equalsIgnoreCase("c")||estadoCivil.equalsIgnoreCase("v")||estadoCivil.equalsIgnoreCase("d")){
             infVal = true;
    }       else {
                System.out.println("O estado civil de ser igual a 's', 'c', 'v' ou 'd'!");
             }
        }
        while(!infVal);
        
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("salario: " + salario);
        System.out.println("sexo: " + sexo);
        System.out.println("estado civil: " + estadoCivil);
    }
    
}
