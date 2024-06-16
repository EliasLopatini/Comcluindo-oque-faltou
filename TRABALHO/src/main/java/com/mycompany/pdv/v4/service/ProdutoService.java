/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdv.v4.service;

import com.mycompany.pdv.v4.ConectionInterface.ProdutoInterface;
import com.mycompany.pdv.v4.models.Produto;
import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author elias
 */
public class ProdutoService implements ProdutoInterface{

    @Override
    public Call<List<Produto>> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Call<Void> insertProduto(Produto produto) {
                Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        ProdutoInterface produtoService = retrofit.create(ProdutoInterface.class);
        
        return produtoService.insertProduto(produto);
        
      
    }
    
}
