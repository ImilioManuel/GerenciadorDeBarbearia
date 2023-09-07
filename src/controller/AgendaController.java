/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helpers.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import controller.homeController;
import model.DAO.AgendamentoDAO;
import model.DAO.ClienteDAO;
import model.DAO.ServicoDAO;
import model.servico;
import view.agenda_GUI;

/**
 *
 * @author Sara sara
 */
public class AgendaController {
    private final agenda_GUI view;
    private final AgendaHelper helper;

    public AgendaController(agenda_GUI view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void updateCliente(){
        ClienteDAO cliente = new ClienteDAO();
        ArrayList<Cliente> clientes = cliente.selectAll();
        helper.inputCliente(clientes);
    }
    public void updateServico(){
        ServicoDAO servico = new ServicoDAO();
        ArrayList<servico> servicos = servico.selectAll();
        helper.updateServico(servicos);
    }
    public void UpdateValue(){
      servico servico = helper.obterservico();
      helper.setarValor(servico.getValor());
    }
    public void agendar(){ 
        Agendamento novoAgendamento = helper.getModel();
        new AgendamentoDAO().insert(novoAgendamento);
        helper.limparTela();
    }
}
