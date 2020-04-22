package aula05contaBanco;

public class AbrirConta {
// ATRIBUTOS //
    int numConta;
    String tipo;
    String titular;
    double saldo;
    boolean status;
// STATUS ATUAL //
    public void conta() {
        System.out.println(this.getNumConta());
        System.out.println(this.getTipo());
        System.out.println(this.getTitular());
        System.out.println(this.getSaldo());
        System.out.println(this.getStatus());

    }
// METODO CONSTRUTOR //
    public AbrirConta(int numConta, String tipo, String titular, double saldo, boolean status) {
        this.setNumConta(numConta);
        this.setTipo(tipo);
        this.setTitular(titular);
        this.setSaldo(0);
        this.setStatus(false);
    }
// METODOS PERSONALIZADOS //
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cc") {
            this.saldo += 50;
        } else if (tipo == "cp") {
            this.saldo += 150;
        } else {
            System.out.println("tipo de conta invalido!");
        }
    }

    void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Saldo positivo: " + this.saldo + " Necessário realiar saque para fechamento da conta!");
        } else if (this.saldo < 0) {
            System.out.println("Saldo negativo: " + this.saldo + " Necessário realiar deposito do valor em debito de para fechamento da conta!");
        } else {
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    void depositar(double d) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Deposito realizado com sucesso! " + "Saldo atual R$: " + this.saldo);
        } else {

            System.out.println("Deposito não permitido, Conta Inativa! ");
        }
    }

    void sacar(double s) {
        if (this.saldo > 0 && this.status == true && s <= this.saldo) {
            this.setSaldo(this.getSaldo() - s);
            System.out.println("Saque realizado com sucesso!" + "Saldo atual R$: " + this.saldo);
        } else {
            System.out.println("Saldo atual R$: " + this.saldo + ". Saldo insuficiente para realizar saque! ");
        }
    }

    void pagarMensal() {
        double mensal = 0;
        if (this.getTipo() == "cc" && this.saldo > 0 && this.status == true && mensal <= this.saldo) {
            mensal = 12;
            this.setSaldo(this.getSaldo() - mensal);
            System.out.println("Mensalidade debitada com sucesso! " + this.saldo);
        } else if (this.getTipo() == "cp" && this.saldo > 0 && this.status == true && mensal <= this.saldo) {
            mensal = 5;
            this.setSaldo(this.getSaldo() - mensal);
            System.out.println("Mensalidade debitada com sucesso! " + this.saldo);
        } else {
            System.out.println("Saldo atual R$: " + this.saldo + ". Saldo insuficiente para realizar saque! ");
        }
    }
// MOTODOS ACESSORES (GET) E MOTODOS MODIFICADORES (SET) //
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
