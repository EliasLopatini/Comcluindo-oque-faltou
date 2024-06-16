/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdv.v4.service;

import com.mycompany.pdv.v4.ConectionInterface.ProdutoInterface;
import com.mycompany.pdv.v4.ConectionInterface.VendaInterface;
import com.mycompany.pdv.v4.models.Venda;
import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author elias
 */
public class VendaService implements VendaInterface{

    @Override
    public Call<List<Venda>> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Call<Void> insertVenda(Venda venda) {
         Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        VendaInterface vendainterface = retrofit.create(VendaInterface.class);
        
        return vendainterface.insertVenda(venda);
    }

    
    
    
}
