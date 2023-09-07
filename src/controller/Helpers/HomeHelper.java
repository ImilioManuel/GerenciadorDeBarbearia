/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helpers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import view.home_GUI;

/**
 *
 * @author Sara sara
 */
public class HomeHelper {
    private final home_GUI view;

    public HomeHelper(home_GUI view) {
        this.view = view;
    }

    public void inputTable(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel =(DefaultTableModel) view.getjTabela().getModel();
        tableModel.setNumRows(0);
       
        
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDesc(),
                agendamento.getValor(),
                agendamento.getDateFormated(),
                agendamento.getHourFormated(),
                agendamento.getObs()
            });
            
        }
    }
    
    
    
    
    
}
