package control;
import java.util.ArrayList;

public interface DaoGenerica<ObjetoGenerico> {
    
  
    public void inserir(ObjetoGenerico cliente);
    public void alterar (ObjetoGenerico cliente);
    public void exxcluir ();
    public ArrayList<ObjetoGenerico> consultar();
}
