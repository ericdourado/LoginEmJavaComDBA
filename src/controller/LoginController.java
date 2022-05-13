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
import model.Usuario;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author ericd
 */
public class LoginController {

    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {

        //Buscar usuario da view
        String login = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordFieldSenha().getText();

        Usuario userAutenticar = new Usuario(login, senha);
        //verificar no banco
        Conexao conexao = new Conexao();
        Connection conectado = conexao.getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conectado);

        boolean existe = usuarioDao.existeNoBancoPorUsuarioEsenha(userAutenticar);
        if (existe) {
            MenuView telaDeMenu = new MenuView();
            telaDeMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO OU SENHA INCORRETOS");
        }

        //se existir, direcione para MENU
    }

}
