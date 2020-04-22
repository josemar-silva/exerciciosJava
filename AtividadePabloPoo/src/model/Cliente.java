
package model;


public class Cliente {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String nascimento;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String fone;

    public Cliente(int codigo, String nome, String cpf, String rg, String nascimento, String endereco, String bairro, String cidade, String uf, String fone) {
        getCodigo(this.codigo);
        getNome(this.nome);
        getCpf(this.cpf);
        getRg(this.rg);
        getNascimento(this.nascimento);
        getEndereco(this.endereco);
        getBairro(this.bairro);
        getCidade(this.bairro);
        getUf(this.uf);
        getFone(this.fone);
    }

    public Cliente(int codigo, String nome) {
        getCodigo(this.codigo);
        getNome(this.nome);
    }

    public int getCodigo(int codigo1) {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome(String nome1) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf(String cpf1) {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg(String rg1) {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNascimento(String nascimento1) {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco(String endereco1) {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro(String bairro1) {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade(String bairro1) {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf(String uf1) {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFone(String fone1) {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNascimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBairro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
