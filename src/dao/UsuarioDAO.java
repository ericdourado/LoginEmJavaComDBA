package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
/**
 *
 * @author ericd
 */
public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection conexao) {
        this.connection = conexao;
    }
    
    public void insert(Usuario login) throws SQLException{

            String sql = "insert into tbl_user (login, passwd) values ('"+login.getLogin() +"','"+login.getPasswd()+"');";
            //EXECUTANDO A QUERY NO BANCO
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
    
    
    }

    public boolean existeNoBancoPorUsuarioEsenha(Usuario user) throws SQLException {
        
        String sql = "select * from tbl_user where login = '"+ user.getLogin()+"' and passwd = '"+user.getPasswd()+"' ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        ResultSet resultset = statement.getResultSet();
        return resultset.next();
        
    }

    
}
