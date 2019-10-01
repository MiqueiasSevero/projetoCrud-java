package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import gui.*;
public class UsuarioDao { 
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public UsuarioDao(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    public  ResultSet selecionaUsuarios(){
          String sql ="select * from usuario";
          
         try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            
            ResultSet rs = stmt.executeQuery();
            
           return rs;
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
          
    }
    public void DeletaUsuario(int id){
    
            String sql = "DELETE FROM usuario where id = "+ id +" ";    
            
             try { 
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.execute();

             } 
                catch (SQLException u) { 
                    throw new RuntimeException(u);
                } 
    
    }
    public ResultSet LimparCampos(){
        return null;
    }
    
}