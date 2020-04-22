package exerciciodeficxacao01;

public class Livro {
    
    private String titulo;
    private String autor;
    private int totaoPaginas;
    private int pagAtual = 1;
    private boolean aberto ;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totaoPaginas) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotaoPaginas(totaoPaginas);
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotaoPaginas() {
        return totaoPaginas;
    }

    public void setTotaoPaginas(int totaoPaginas) {
        this.totaoPaginas = totaoPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void abrir() {
        if (this.aberto == false) {
            setAberto(true);
        } else {
            this.setAberto(false);
        }
        
    }

    public void fechar() {
        
        if (this.aberto != false) {
            this.setAberto(false);
        } else {
            this.setAberto(true);
        }
    }

    public void folear() {
        if (this.aberto == true){
            setPagAtual(getPagAtual()+5);
        } else if (this.getPagAtual()>= getTotaoPaginas()){
            System.out.println("Nao ha mais paginas para folear!");
        } else {
            System.out.println("O livro deve estar aberto para ser foleado!");
        }
    }

    public void avancarPag() {
        if (this.aberto == true && this.pagAtual <= getTotaoPaginas()){
            setPagAtual(this.getPagAtual()+1);
        } else {
            System.out.println("O livro deve estar aberto para ser foleado!");
        }
    
    }

    public void voltarPag() {
        if (this.aberto == true && this.pagAtual >= 1 && getPagAtual()<= getTotaoPaginas()){
            setPagAtual(this.getPagAtual()-1);
        }else {
            System.out.println("O livro deve estar aberto para ser foleado!");
        }
    }
    
}
