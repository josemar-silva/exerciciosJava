package model;

public class Produto {
    
    private int codigo;
    private String descricao;
    private String marca;
    private String modelo;
    private int qntestoque;

    public Produto(int codigo, String descricao, String marca, String modelo, int qntestoque) {
        getCodigo(this.codigo);
        getDescricao(this.descricao);
        getMarca(this.marca);
        getModelo(this.modelo);
        getQntestoque(this.qntestoque);
    }

    public Produto(int codigo, String descricao, int qntestoque) {
        getCodigo(this.codigo);
        getDescricao(this.descricao);
        getQntestoque(this.qntestoque);
    }

    public int getCodigo(int codigo1) {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao(String descricao1) {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca(String marca1) {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(String modelo1) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntestoque(int qntestoque1) {
        return qntestoque;
    }

    public void setQntestoque(int qntestoque) {
        this.qntestoque = qntestoque;
    }
    
    
    
}
