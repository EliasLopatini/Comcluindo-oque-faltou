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
public class Produto {
    private long id;
    private String descricao;
    private double preco;
    private String categoria;

    public Produto() {
    }

    public Produto(long id, String descricao, double preco, String categoria) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    private static final Logger LOG = Logger.getLogger(Produto.class.getName());

    
    
    
}
