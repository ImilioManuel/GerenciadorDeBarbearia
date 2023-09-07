/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helpers.HomeHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.DAO.AgendamentoDAO;
import view.agenda_GUI;
import view.home_GUI;

/**
 *
 * @author Sara sara
 */
public class homeController {
    private final home_GUI view;
    private final HomeHelper helper;

    public homeController(home_GUI view) {
        this.view = view;
        this.helper = new HomeHelper(view);
    }
    
    public void goAgenda(){
        agenda_GUI age = new agenda_GUI();
        age.setVisible(true);
    }
    
    public void updateTable(){
        AgendamentoDAO agendamentodao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentodao.selectAll(); 
        helper.inputTable(agendamentos);  
    }
    
    
}
