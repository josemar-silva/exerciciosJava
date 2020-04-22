package projetofinalpooguanabara;

public class ProjetoFinalPooGuanabara {
    
    public static void main(String[] args) {

    Videos v[] = new Videos[3];
    v[0] = new Videos("Codigo Davinci");
    v[1] = new Videos("Armagedon");
    v[2] = new Videos("La Casa de Papel");
    
   Gafanhoto g1 = new Gafanhoto("jose", 31, "m", "ads");
   Gafanhoto g2 = new Gafanhoto("maria", 29, "f", "abc");
   
      
   Visualizacao v1 = new Visualizacao(g1, v[0]);
   Visualizacao v2 = new Visualizacao(g2, v[1]);
   Visualizacao v3 = new Visualizacao(g2, v[2]);
   Visualizacao v4 = new Visualizacao(g2, v[0]);
   
        
        System.out.println(v1.toString()+"\n");
        System.out.println(v2.toString()+"\n");
        System.out.println(v3.toString()+"\n");
        System.out.println(v4.toString()+"\n");
    }
    
}
