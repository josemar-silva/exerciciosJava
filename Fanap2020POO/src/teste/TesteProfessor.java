package teste;

import modelo.Professor;

public class TesteProfessor {

    public static void main(String[] args) {

        Professor p[] = new Professor[5];
        
        p[0] = new Professor(1, "Joao", "Pinto", "01/01/1946", "111.111.111-11", "Pedagogia", "Doutor");
        p[1] = new Professor(2, "Mria", "Da Silva", "26/04/1981", "222.222.222-22", "Matematica", "Baixarel");
        p[2] = new Professor(3, "Pedro", "Sousa", "01/11/1955", "333.333.333-33", "Historia", "Doutora");
        p[3] = new Professor(4, "Aline", "Cardoso", "10/05/1986", "444.444.444-44", "Ciencias da Computação", "Mestre");
        p[4] = new Professor(5, "Carlos", "Pina", "12/12/1956", "555.555.555-55", "Direito", "Mestre");
        
        System.out.println("Funcional:" + p[0].getFuncional());
        System.out.println("Nome e Sobrenome:" + p[0].getNome()+ " " + p[0].getSobrenome());
        System.out.println("Nascimento:" + p[0].getNascimento());
        System.out.println("Cpf:" + p[0].getCpf());
        System.out.println("Formação:" + p[0].getFormacao());
        System.out.println("Titulação:" + p[0].getTitulacao());
        
        System.out.println("");
        
        System.out.println("Funcional:" + p[1].getFuncional());
        System.out.println("Nome e Sobrenome:" + p[1].getNome()+ " " + p[1].getSobrenome());
        System.out.println("Nascimento:" + p[1].getNascimento());
        System.out.println("Cpf:" + p[0].getCpf());
        System.out.println("Formação:" + p[1].getFormacao());
        System.out.println("Titulação:" + p[1].getTitulacao());
        
        System.out.println("");
        
        System.out.println("Funcional:" + p[2].getFuncional());
        System.out.println("Nome e Sobrenome:" + p[2].getNome()+ " " + p[2].getSobrenome());
        System.out.println("Nascimento:" + p[2].getNascimento());
        System.out.println("Cpf:" + p[2].getCpf());
        System.out.println("Formação:" + p[2].getFormacao());
        System.out.println("Titulação:" + p[2].getTitulacao());
        
        System.out.println("");
        
        System.out.println("Funcional:" + p[3].getFuncional());
        System.out.println("Nome e Sobrenome:" + p[3].getNome()+ " " + p[3].getSobrenome());
        System.out.println("Nascimento:" + p[3].getNascimento());
        System.out.println("Cpf:" + p[3].getCpf());
        System.out.println("Formação:" + p[3].getFormacao());
        System.out.println("Titulação:" + p[3].getTitulacao());
        
        System.out.println("");
        
        System.out.println("Funcional:" + p[4].getFuncional());
        System.out.println("Nome e Sobrenome:" + p[4].getNome()+ " " + p[4].getSobrenome());
        System.out.println("Nascimento:" + p[4].getNascimento());
        System.out.println("Cpf:" + p[4].getCpf());
        System.out.println("Formação:" + p[4].getFormacao());
        System.out.println("Titulação:" + p[4].getTitulacao());
        
    }
    
}
