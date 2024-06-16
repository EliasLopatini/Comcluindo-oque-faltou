/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdv.v4.models;



import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author renat
 */
public class Venda {
    
    private long id;


//    private Date data;
    private Cliente cliente;
    private Double total;
    private String observacoes;

    public Venda() {
    }

    public Venda(long id, Date data, Cliente cliente, Double total, String observacoes) {
        this.id = id;
//        this.data = data;
        this.cliente = cliente;
        this.total = total;
        this.observacoes = observacoes;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public Date getData() {
//        return data;
//    }
//
//    public void setData(Date data) {
//        this.data = data;
//    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    private static final Logger LOG = Logger.getLogger(Venda.class.getName());
    
    
}
