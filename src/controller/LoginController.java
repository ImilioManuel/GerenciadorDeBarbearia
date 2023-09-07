/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.DAO.UsuarioDAO;
import controller.Helpers.LoginHelper;
import model.Usuario;
import view.home_GUI;
import view.login_GUI;

/**
 *
 * @author Sara sara
 */
public class LoginController {

    private final login_GUI view;
    private LoginHelper helper;

    public LoginController(login_GUI view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    public void loginInSystem(){
        //Pegar os dados da View Login
        Usuario usuario = helper.getModel();
        UsuarioDAO usuariodao = new UsuarioDAO();
        Usuario usuarioAutenticado = usuariodao.selectPorNomeESenha(usuario);
        if(usuarioAutenticado != null){
            home_GUI home = new home_GUI();
            home.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou Senha Inválida");
            LoginHelper limpa = new LoginHelper(view);
            limpa.limparTela();
        }
        
        
        
    }
    
    
}
