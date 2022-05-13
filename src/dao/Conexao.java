package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ericd
 */
public class Conexao {

    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usersJava", "postgres", "123");
        return conexao;
    }
}
