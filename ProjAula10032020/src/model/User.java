package model;

public class User {
    String nome;
    char fone;
    char email;

    public User() {
    }

    public User(String nome, char fone, char email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(char fone) {
        this.fone = fone;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }
    
   
}
