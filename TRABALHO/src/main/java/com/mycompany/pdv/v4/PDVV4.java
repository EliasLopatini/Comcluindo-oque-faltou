/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pdv.v4;

import com.mycompany.pdv.v4.panel.Pdv_Panel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author elias
 */
public class PDVV4 {

   private static final String LOG_DIRECTORY = "log";
    private static final String LOG_FILE_NAME = "log_operacao.txt";
    private static final File logFile = new File(LOG_DIRECTORY, LOG_FILE_NAME);
    
    
    public static void main(String[] args) {
          gerarLog();
          new Pdv_Panel().setVisible(true);
      
          
        
    }
      public static void gerarLog(){
        java.util.Date date = new java.util.Date(System.currentTimeMillis());

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
               System.out.println("Arquivo log criado com sucesso!");
        writer.write("OPERAÇÃO:CRIAÇÃO DO ARQUIVO, STATUS:SUCESSO"+date+"\n");
        writer.newLine();
        } catch (IOException e) {
        e.printStackTrace();
        }
      }
      
      
      
      
      
      
      
      
      
      
      
}
      