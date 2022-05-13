/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;
import view.FormCadastroView;

/**
 *
 * @author ericd
 */
public class FormCadastroController {
    private FormCadastroView view;

    public FormCadastroController(FormCadastroView view) {
        this.view = view;
    }
    
    public void salvaUsuario(){
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Usuario novoUsuario = new Usuario(usuario, senha);
        
        try {
            Conexao conexao = new Conexao();
            Connection conectado = conexao.getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conectado);
            usuarioDao.insert(novoUsuario);
            
            JOptionPane.showMessageDialog(null, "Usuário inserido no banco e cadastrado");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ou inserir dados no banco" + 
                    ex.getMessage());
        }
    }
    
}
