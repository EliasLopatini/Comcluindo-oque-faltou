/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdv.v4.ConectionInterface;


import com.mycompany.pdv.v4.models.Cliente;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


/**
 *
 * @author renat
 */
public interface ClienteInterface {
    
    @GET("/clientes/all")
    Call<List<Cliente>> findAll();
    
    @POST("/clientes") 
    Call<Void> insertCliente(@Body Cliente cliente);
    
}
