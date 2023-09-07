/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helpers;

import model.Usuario;
import view.login_GUI;

/**
 *
 * @author Sara sara
 */
public class LoginHelper implements IHelper {

    private final login_GUI view;

    public LoginHelper(login_GUI view) {
        this.view = view;
    }

    public Usuario getModel() {
        String nome = view.getLoginUsuario().getText();
        String senha = view.getLoginSenha().getText();

        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }

    public void setModel(Usuario modelo) {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getLoginUsuario().setText(nome);
        view.getLoginSenha().setText(senha);
    }
    public void limparTela(){
        view.getLoginUsuario().setText("");
        view.getLoginSenha().setText("");
    }



}
