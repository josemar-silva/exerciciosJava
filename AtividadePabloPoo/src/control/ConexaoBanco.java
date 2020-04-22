package control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;

    public ConexaoBanco(String servidor, String banco, String usuario, String senha) {
        this.servidor = "localgost";
        this.banco = "atividadepablopoo";
        this.usuario = "root";
        this.senha = "";
        
    }

    public ConexaoBanco() {
    }
    
    public boolean conectar(){
        try
        {
            this.conexao = (Connection) DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
        }
        catch(SQLException ex) {
                }
        String ex = null;
        throw new RuntimeException(ex);
                }

    public Connection getConexao() {
        return conexao;
    }
        
    
}
