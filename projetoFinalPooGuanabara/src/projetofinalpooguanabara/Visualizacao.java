package projetofinalpooguanabara;

public class Visualizacao {
    private Gafanhoto espectador;
    private Videos filme; 

    public Visualizacao(Gafanhoto espectador, Videos filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssitido(this.espectador.getTotAssitido()+1);
        this.filme.setViws(this.filme.getViws()+1);
        this.filme.setReproduzindo(true);
        this.espectador.setExperiencia(this.espectador.getExperiencia()+5);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Videos getFilme() {
        return filme;
    }

    public void setFilme(Videos filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
