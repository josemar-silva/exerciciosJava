package model;

public class ItemVenda {
    
    private int codigo;
    private float qntd;
    private float valor;

    public ItemVenda(int codigo, float qntd, float valor) {
        getCodigo(this.codigo);
        getQntd(this.qntd);
        getValor(this.valor);
    }

    public int getCodigo(int codigo1) {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getQntd(float valor1) {
        return qntd;
    }

    public void setQntd(float qntd) {
        this.qntd = qntd;
    }

    public float getValor(float valor1) {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
