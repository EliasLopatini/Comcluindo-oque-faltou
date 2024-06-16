/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdv.v4.models;

import java.util.logging.Logger;

/**
 *
 * @author renat
 */
public class ItemVenda {
    
    private long id;
    private int quantidade;
    private double valor_Unitario;
    private double valor_total;
    
    
    private Venda venda;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(long id, int quantidade, double valor_Unitario, double valor_total, Venda venda, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor_Unitario = valor_Unitario;
        this.valor_total = valor_total;
        this.venda = venda;
        this.produto = produto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_Unitario() {
        return valor_Unitario;
    }

    public void setValor_Unitario(double valor_Unitario) {
        this.valor_Unitario = valor_Unitario;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    private static final Logger LOG = Logger.getLogger(ItemVenda.class.getName());
    
    
    
}
