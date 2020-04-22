package relacionamentoentreentreclasses;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int runds;
    private boolean aprovada;

    public Luta() {

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRunds() {
        return runds;
    }

    public void setRunds(int runds) {
        this.runds = runds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("Luta nao pode ser marcarada! Verifique as Regras de Luta!");
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println(" ");

            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println(" ");

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println(" ");
                    System.out.println("$$ LUTA EMPATADA $$");

                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    this.desafiado.status();
                    System.out.println(" ");

                    this.desafiante.status();
                    System.out.println(" ");

                    break;

                case 1:
                    System.out.println(" ");

                    System.out.println("Vitoria do " + this.getDesafiado().getNome());
                    System.out.println(" ");

                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    this.desafiado.status();
                    System.out.println(" ");

                    break;

                case 2:
                    System.out.println(" ");

                    System.out.println("Vitoria do " + this.getDesafiante().getNome());
                    System.out.println(" ");

                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    this.desafiante.status();
                    System.out.println(" ");

                    break;
            }
        } else {
            System.out.println("Luta nao permitida! Verifique as Regras de Luta!");

        }
    }

}
