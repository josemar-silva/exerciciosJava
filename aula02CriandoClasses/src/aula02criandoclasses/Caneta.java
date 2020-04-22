
package aula02criandoclasses;


public final class Caneta {
        //     ATRIBUTOS  //
     private String modelo;
     private String cor;
     private double ponta;
     private boolean tampada;
     private  int carga;

    void status() {
        System.out.println(this.getCor());
        System.out.println(this.getModelo());
        System.out.println(this.getPonta());
        System.out.println(this.isTampada());

         }
    
    public Caneta (String m, String c, double p , boolean t, int cg){    
            // CONSTRUTOR //  
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setTampada(true);
        this.setCarga(cg);
    }

          void escrever() {
             // METODOS //
        if (this.carga > 0 && this.tampada == true) {
                System.out.println("CANETA TAMPADA NAO PODE ESCREVER!");
            } else {
                System.out.println("Escrevendo...");
            }
         }

          void rabiscar() {
        if (this.carga > 0 && this.tampada == true) {
                System.out.println("CANETA TAMPADA NAO PODE RABISCAR!");
            } else {
                System.out.println("Rabiscando...");
            }
         }
         
          void pintar() {
        if (this.carga > 0 && this.tampada == true) {
                System.out.println("CANETA TAMPADA NAO PODE PINTAR!");
            } else {
                System.out.println("Pintando...");
            }
         }
          void destampar() {
             this.setTampada(false);
        }
         

         void tampar() {
            this.setTampada(true);
        }
        // MOTODOS ACESSORES (GET) E MOTODOS MODIFICADORES (SET) //
  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}

        
    

