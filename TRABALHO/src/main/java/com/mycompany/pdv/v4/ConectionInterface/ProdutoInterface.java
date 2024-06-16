/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdv.v4.ConectionInterface;


import com.mycompany.pdv.v4.models.Cliente;
import com.mycompany.pdv.v4.models.Produto;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 *
 * @author renat
 */
public interface ProdutoInterface {
    
    @GET("/produtos/all")
    Call<List<Produto>> findAll();
    
    
    @POST("/produtos") 
     Call<Void> insertProduto(@Body Produto produto);
    
}
