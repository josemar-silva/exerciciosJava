package exerciciodeficxacao01;

public class ExercicioDeFicxacao01 {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("josemar", 31, 'M');
        p.aniversario();
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getSexo());
        
        Livro l = new Livro( "Zorro","james", 50);
        
       
        
        l.folear();
        
        l.avancarPag();
        
        l.voltarPag();
        
        System.out.println(l.getAberto());
        System.out.println(l.getTitulo());
        System.out.println(l.getAutor());
        System.out.println(l.getTotaoPaginas());
        System.out.println(l.getPagAtual());
        
        
        
        
        
       
       
    }
    
}
