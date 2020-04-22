package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteDao implements DaoGenerica<Cliente>{
        
        private ConexaoBanco conexao;
     

    public ClienteDao(ConexaoBanco conexao) {
        this.conexao = new ConexaoBanco();
    }

    @Override
    public void inserir(Cliente cliente) {
         String sql = "INSERT INTO CLIENTE VALUES (01,JOSEMAR,021685981669,4982340,07051988,RUA 14,INDEPENDENCIA,APARECIDA DE GOIANIA,GO,985959782)";
        
        try {
            if (this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConexao().prepareStatement(sql);
                sentenca.setString(1, cliente.getCodigo());
                sentenca.setString(1, cliente.getNome());
                sentenca.setString(1, cliente.getCpf());
                sentenca.setString(1, cliente.getRg());
                sentenca.setString(1, cliente.getNascimento());
                sentenca.setString(1, cliente.getEndereco());
                sentenca.setString(1, cliente.getBairro());
                sentenca.setString(1, cliente.getCidade());
                sentenca.setString(1, cliente.getUf());
                sentenca.setString(1, cliente.getFone());
              
                sentenca.execute();
                sentenca.close();
                this.conexao.getConexao().close();
            }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }       catch (SQLException ex) {
            }
            String ex = null;
        throw new RuntimeException(ex);
    }

    @Override
    public void alterar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exxcluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
   
 
   
    }


