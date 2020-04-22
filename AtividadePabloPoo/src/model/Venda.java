package model;

public class Venda {
    
    private int codigo;
    private String data;
    private float desconto;

    public Venda(int codigo, String data, float desconto) {
        getCodigo(this.codigo);
        getData(this.data);
        getDesconto(this.desconto);
    }

    public int getCodigo(int codigo1) {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData(String data1) {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getDesconto(float desconto1) {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    
}
