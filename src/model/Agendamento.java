/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sara sara
 */
public class Agendamento {
    private int id;
    private Cliente cliente;
    private servico servico;
    private float valor;
    private Date data;
    private String obs;
    private static int idAuto = 0;

    public Agendamento(Cliente cliente, servico servico, float valor, String data) {
        idAuto++;
        this.id = idAuto;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Agendamento(Cliente cliente, servico servico, float valor, String data,String obs) {
       this(cliente,servico,valor,data);
       this.obs = obs;
    }

    public int getId() {
        return id;
    }
    
    

   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public servico getServico() {
        return servico;
    }

    public void setServico(servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDateFormated(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    public String getHourFormated(){
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
     
    
}
