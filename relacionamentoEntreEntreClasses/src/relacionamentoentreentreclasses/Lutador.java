package relacionamentoentreentreclasses;

public class Lutador implements Competidor {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

   
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            System.out.println("Peso abaixo do minimo permitido. Nao pode lutar");
        } else if (this.peso <= 70.3) {
          this.categoria="Leve";
            } else if (this.peso <= 83.9){
                this.categoria ="Medio";
            } else if (this.peso<=120.2){
                this.categoria="Pesado";
            } else{
                System.out.println("Peso fora do permitido para as categorias!");
            }
        }

    @Override
    public void apresentar() {
        System.out.println("CHEGOU A HORA!!! Apresentamos o lutador " + getNome());
        System.out.println("direteamente do(a) " + getNacionalidade());
        System.out.println("ele tem " + getIdade() + " anos" );
        System.out.println("Medindo " + getAltura()+ " de altura e ");
        System.out.println("pesando "+ getPeso() + " quilos.");
        System.out.println(" Já ganhaou " + getVitorias() + " lutas, ");
        System.out.println(" perdeu " + getDerrotas() + " e ");
        System.out.println("empatou " +getEmpates() + " lutas");
    }

    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println( getVitorias()+ " vitorias");
        System.out.println(getDerrotas()+ " derrotas");
        System.out.println(getEmpates()+ " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatar() {
        this.setEmpates(this.getEmpates()+1);
    }

    }


