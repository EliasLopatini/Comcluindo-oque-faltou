/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pdv.v4.panel;

import com.mycompany.pdv.v4.ConectionInterface.ClienteInterface;
import static com.mycompany.pdv.v4.PDVV4.gerarLog;
import com.mycompany.pdv.v4.dto.ClienteDto;
import com.mycompany.pdv.v4.models.Cliente;
import com.mycompany.pdv.v4.service.ClienteService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author renat
 */
public class Tabela_Cliente_update extends javax.swing.JFrame {

    private static final String LOG_DIRECTORY = "log";
    private static final String LOG_FILE_NAME = "log_operacao.txt";
    private static final File logFile = new File(LOG_DIRECTORY, LOG_FILE_NAME);
    public Tabela_Cliente_update() {
        initComponents();
        
        tabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        ClienteInterface clienteAPI = retrofit.create(ClienteInterface.class);
        clienteAPI.findAll().enqueue(new Callback<List<Cliente>>() {
            @Override
            public void onResponse(Call<List<Cliente>> call, Response<List<Cliente>> response) {
                if (response.isSuccessful()) {

                    DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Id", "Nome", "Email" , "Telefone"}, 0);
                    List<Cliente> clientes = response.body();
                    SwingUtilities.invokeLater(() -> {
                        for (Cliente cliente : clientes) {
                            tableModel.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone()});
                        }
                        tabelaCliente.setModel(tableModel);
                    });
                } else {
                    System.err.println("Erro na resposta: " + response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<List<Cliente>> call, Throwable t) {
                t.printStackTrace();
            }
        });
           iniciarAtualizacaoAutomatica();
    }


    private void iniciarAtualizacaoAutomatica() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
       scheduler.scheduleAtFixedRate(this::atualizarTabelaClientes, 0, 5, TimeUnit.MINUTES);
    }
    
    private void atualizarTabelaClientes() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ClienteInterface clienteAPI = retrofit.create(ClienteInterface.class);
        clienteAPI.findAll().enqueue(new Callback<List<Cliente>>() {
            @Override
            public void onResponse(Call<List<Cliente>> call, Response<List<Cliente>> response) {
                if (response.isSuccessful()) {
                    List<Cliente> clientes = response.body();
                    if (clientes != null) {
                        SwingUtilities.invokeLater(() -> {
                            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Id", "Nome", "Email", "Telefone"}, 0);
                            for (Cliente cliente : clientes) {
                                tableModel.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone()});
                            }
                            tabelaCliente.setModel(tableModel);
                        });
                    } else {
                        System.err.println("Lista de clientes retornou vazia.");
                    }
                } else {
                    System.err.println("Erro na resposta: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Cliente>> call, Throwable t) {
                t.printStackTrace();
            }
        });
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btSelecionarCliente = new javax.swing.JButton();
        btSelecionarCliente1 = new javax.swing.JButton();
        btSelecionarCliente2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(6, 114, 156));

        jLabel1.setBackground(new java.awt.Color(210, 210, 210));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 114, 156));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABELA  DE CLIENTES");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        tabelaCliente.setBackground(new java.awt.Color(210, 210, 210));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Cliente", "nome ", "telefone", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.setShowGrid(true);
        jScrollPane3.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(3).setResizable(false);
        }

        btSelecionarCliente.setBackground(new java.awt.Color(112, 151, 178));
        btSelecionarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSelecionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btSelecionarCliente.setText("Atualizar");
        btSelecionarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSelecionarCliente.setMaximumSize(new java.awt.Dimension(72, 23));
        btSelecionarCliente.setMinimumSize(new java.awt.Dimension(72, 23));
        btSelecionarCliente.setName("btSelecionar"); // NOI18N
        btSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarClienteActionPerformed(evt);
            }
        });

        btSelecionarCliente1.setBackground(new java.awt.Color(204, 0, 0));
        btSelecionarCliente1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSelecionarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btSelecionarCliente1.setText("Sair");
        btSelecionarCliente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSelecionarCliente1.setMaximumSize(new java.awt.Dimension(72, 23));
        btSelecionarCliente1.setMinimumSize(new java.awt.Dimension(72, 23));
        btSelecionarCliente1.setName("btSelecionar"); // NOI18N
        btSelecionarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarCliente1ActionPerformed(evt);
            }
        });

        btSelecionarCliente2.setBackground(new java.awt.Color(112, 151, 178));
        btSelecionarCliente2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSelecionarCliente2.setForeground(new java.awt.Color(255, 255, 255));
        btSelecionarCliente2.setText("Cadastrar");
        btSelecionarCliente2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSelecionarCliente2.setMaximumSize(new java.awt.Dimension(72, 23));
        btSelecionarCliente2.setMinimumSize(new java.awt.Dimension(72, 23));
        btSelecionarCliente2.setName("btSelecionar"); // NOI18N
        btSelecionarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarCliente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSelecionarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelecionarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarClienteActionPerformed
        
        tabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        ClienteInterface clienteAPI = retrofit.create(ClienteInterface.class);
        clienteAPI.findAll().enqueue(new Callback<List<Cliente>>() {
            @Override
            public void onResponse(Call<List<Cliente>> call, Response<List<Cliente>> response) {
                if (response.isSuccessful()) {

                    DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Id", "Nome", "Email" , "Telefone"}, 0);
                    List<Cliente> clientes = response.body();
                    SwingUtilities.invokeLater(() -> {
                        for (Cliente cliente : clientes) {
                            tableModel.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone()});
                        }
                        tabelaCliente.setModel(tableModel);
                    });
                } else {
                    System.err.println("Erro na resposta: " + response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<List<Cliente>> call, Throwable t) {
                t.printStackTrace();
            }
        });
        
    }//GEN-LAST:event_btSelecionarClienteActionPerformed

    private void btSelecionarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarCliente1ActionPerformed
         this.dispose();
    }//GEN-LAST:event_btSelecionarCliente1ActionPerformed

    private void btSelecionarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarCliente2ActionPerformed
      new Cadastro_Cliente().setVisible(true);
    }//GEN-LAST:event_btSelecionarCliente2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabela_Cliente_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela_Cliente_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela_Cliente_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela_Cliente_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela_Cliente_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSelecionarCliente;
    private javax.swing.JButton btSelecionarCliente1;
    private javax.swing.JButton btSelecionarCliente2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaCliente;
    // End of variables declaration//GEN-END:variables
}
