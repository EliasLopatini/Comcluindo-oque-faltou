/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pdv.v4.ConectionInterface;


import com.mycompany.pdv.v4.models.Venda;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 *
 * @author elias
 */
public interface VendaInterface {
    
    @GET("/venda/all")
    Call<List<Venda>> findAll();
    
    @POST("/venda") 
    Call<Void> insertVenda(@Body Venda venda);

}
