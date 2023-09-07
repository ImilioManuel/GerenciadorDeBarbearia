/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helpers;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Agendamento;
import model.Cliente;
import model.servico;
import view.agenda_GUI;

/**
 *
 * @author Sara sara
 */
public class AgendaHelper implements IHelper {

    private final agenda_GUI view;

    public AgendaHelper(agenda_GUI view) {
        this.view = view;
    }

    public void inputCliente(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) view.getComboCliente().getModel();

        for (Cliente cliente : clientes) {
            comboboxModel.addElement(cliente);
        }
    }

    public void updateServico(ArrayList<servico> servicos) {
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) view.getComboServico().getModel();

        for (servico servico : servicos) {
            comboboxModel.addElement(servico);

        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getComboCliente().getSelectedItem();

    }

    public servico obterservico() {
        return (servico) view.getComboServico().getSelectedItem();

    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor + "");
    }

    @Override
    public Agendamento getModel() {
        Cliente novoCliente = obterCliente();
        servico novoServico = obterservico();
        float valor = Float.parseFloat(view.getTextValor().getText());
        String data = view.getDataText().getText();
        String hora = view.getHoraText().getText();
        String dataHora = data + " " + hora;

        Agendamento novoAgendamento = new Agendamento(novoCliente, novoServico, valor, dataHora);
        return novoAgendamento;
    }

    @Override
    public void limparTela() {
        view.getDataText().setText("");
        view.getHoraText().setText("");
    }

}
