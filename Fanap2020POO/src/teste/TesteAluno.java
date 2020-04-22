package teste;

import modelo.Aluno;

public class TesteAluno {
    
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno();
        aluno1.setCodigo(1);
        aluno1.setNome("Saul");
        aluno1.setSobrenome("Matuzinhos");
        aluno1.setCpf("000.000.000-00");
        
        System.out.println("Codigo:" + aluno1.getCodigo());
        System.out.println("Nome:" + aluno1.getNome());
        System.out.println("Sobrenome:" + aluno1.getSobrenome());
        System.out.println("cpf:" + aluno1.getCpf());
    }
    
}
