package aula05contaBanco;

import java.util.Scanner;

public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        AbrirConta n = new AbrirConta(1234, "cc", "josemar", 0, true);
        n.conta();
        n.abrirConta("cc");
        n.conta();
        n.depositar(500);
        n.conta();
        n.sacar(550);
        n.pagarMensal();
        n.fecharConta();
        n.sacar(96);
        n.conta();
        n.sacar(95);
        n.fecharConta();

    }

}
