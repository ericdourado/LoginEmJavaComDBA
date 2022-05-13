/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ericd
 */
public class Usuario {
    private int id;
    private String login;
    private String passwd;

    //CONSTRUTOR
    public Usuario(int id, String login, String passwd) {
        this.id = id;
        this.login = login;
        this.passwd = passwd;
    }

    public Usuario(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
    
}
