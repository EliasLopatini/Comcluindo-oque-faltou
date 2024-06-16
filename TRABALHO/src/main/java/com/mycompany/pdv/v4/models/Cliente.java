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
public class Cliente {
    
    private long id;
    private String nome;
    private String telefone;
    private String email;

    public Cliente() {
    }

   

    public Cliente(long id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private static final Logger LOG = Logger.getLogger(Cliente.class.getName());

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
    
}
