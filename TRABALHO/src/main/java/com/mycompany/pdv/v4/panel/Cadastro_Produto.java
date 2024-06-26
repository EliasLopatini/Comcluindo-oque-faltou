/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pdv.v4.panel;

import com.mycompany.pdv.v4.ConectionInterface.ClienteInterface;
import com.mycompany.pdv.v4.ConectionInterface.ProdutoInterface;
import com.mycompany.pdv.v4.dto.ProdutoDto;
import com.mycompany.pdv.v4.models.Cliente;
import com.mycompany.pdv.v4.models.Produto;
import com.mycompany.pdv.v4.service.ProdutoService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author renat
 */
public class Cadastro_Produto extends javax.swing.JFrame {

      private static final String LOG_DIRECTORY = "log";
    private static final String LOG_FILE_NAME = "log_operacao.txt";
    private static final File logFile = new File(LOG_DIRECTORY, LOG_FILE_NAME);
    ProdutoDto produtoPassado = new ProdutoDto();
   
    public Cadastro_Produto() {
        initComponents();
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        textFieldDescrição = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JLabel();
        textFieldValorUnitario = new javax.swing.JTextField();
        btRemover = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(6, 114, 156));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));

        jLabel1.setBackground(new java.awt.Color(210, 210, 210));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 114, 156));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE PRODUTOS");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("DESCRIÇÃO:");

        textFieldDescrição.setBackground(new java.awt.Color(210, 210, 210));
        textFieldDescrição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescriçãoActionPerformed(evt);
            }
        });

        txtNome1.setBackground(new java.awt.Color(0, 0, 0));
        txtNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(255, 255, 255));
        txtNome1.setText("VALOR UNITARIO:");

        textFieldCategoria.setBackground(new java.awt.Color(210, 210, 210));
        textFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaActionPerformed(evt);
            }
        });

        txtNome2.setBackground(new java.awt.Color(255, 255, 255));
        txtNome2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNome2.setForeground(new java.awt.Color(255, 255, 255));
        txtNome2.setText("CATEGORIA: ");

        textFieldValorUnitario.setBackground(new java.awt.Color(210, 210, 210));
        textFieldValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValorUnitarioActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(255, 51, 51));
        btRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemover.setForeground(new java.awt.Color(0, 0, 0));
        btRemover.setText("CANCELAR");
        btRemover.setToolTipText("");
        btRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btSalvar1.setBackground(new java.awt.Color(0, 204, 0));
        btSalvar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvar1.setForeground(new java.awt.Color(0, 0, 0));
        btSalvar1.setText("Salvar");
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtNome1)
                            .addComponent(txtNome2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btSalvar1))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldDescriçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescriçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescriçãoActionPerformed

    private void textFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoriaActionPerformed

    private void textFieldValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValorUnitarioActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
       this.dispose();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
     
        Produto produto = new Produto(); 
        ProdutoService produtoService = new ProdutoService();
        produtoService.insertProduto(produto); 
        
     
        produto.setDescricao(textFieldDescrição.getText());
        produto.setPreco(Double.parseDouble(textFieldValorUnitario.getText()));
        produto.setCategoria(textFieldCategoria.getText());
       
       
        Call<Void> call = produtoService.insertProduto(produto);

        call.enqueue(new Callback<Void>() {
        @Override
        public void onResponse(Call<Void> call, Response<Void> response) {
        if (response.isSuccessful()) {
            java.util.Date date = new java.util.Date(System.currentTimeMillis());

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
        System.out.println("Arquivo log atualizado com sucesso!");
        writer.write("OPERAÇÃO:INSERT DE PRODUTO, STATUS:SUCESSO, "+date+"\n");
        writer.newLine();
        } 
         catch (IOException e) {
                    
            e.printStackTrace();
        }
      
        } else {


    java.util.Date date = new java.util.Date(System.currentTimeMillis());

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
        System.out.println("Arquivo log criado com sucesso!");
        writer.write("OPERAÇÃO:INSERT DE PRODUTO, STATUS:ERRO, "+date+"\n");
        writer.newLine();
        } 
         catch (IOException e) {
                    
            e.printStackTrace();
        }
        }
        }

        @Override
        public void onFailure(Call<Void> call, Throwable t) {
        // Tratar falha na requisição
         }
            });
        
        
        
        



         new Teladesucesso().setVisible(true);

    }//GEN-LAST:event_btSalvar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldDescrição;
    private javax.swing.JTextField textFieldValorUnitario;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNome1;
    private javax.swing.JLabel txtNome2;
    // End of variables declaration//GEN-END:variables
}
