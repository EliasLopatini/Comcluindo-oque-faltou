
package com.mycompany.pdv.v4.panel;
import com.mycompany.pdv.v4.ConectionInterface.VendaInterface;
import com.mycompany.pdv.v4.dto.ClienteDto;
import com.mycompany.pdv.v4.dto.ProdutoDto;

import com.mycompany.pdv.v4.models.Cliente;
import com.mycompany.pdv.v4.models.Venda;
import com.mycompany.pdv.v4.service.VendaService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class Venda_Panel extends javax.swing.JFrame {

    
    private static final String LOG_DIRECTORY = "log";
    private static final String LOG_FILE_NAME = "log_operacao.txt";
    private static final File logFile = new File(LOG_DIRECTORY, LOG_FILE_NAME);
    private Double valorTotal = 0.0;
    private VendaInterface vendaInterface;
    private String quantidadeProduto;
    ClienteDto clienteInsercao = new ClienteDto();
    ProdutoDto produtoInsercao = new ProdutoDto();
    DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[]{"Cod", "Descrição", "Valor unit", "Qtd", "Valor total"}, 0);
   

    public Venda_Panel() {
        initComponents();
        tbProdutos.setModel(defaultTableModel);
        
            Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    
     vendaInterface = retrofit.create(VendaInterface.class);
     
     
      
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        txtTotalVenda = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btSalvar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        txtCod = new javax.swing.JTextField();
        txtDescricaoProduto = new javax.swing.JTextField();
        btNovoProduto = new javax.swing.JButton();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNomeCliente1 = new javax.swing.JTextField();
        btNovoCliente = new javax.swing.JButton();
        btNovoProduto1 = new javax.swing.JButton();
        txtObs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(6, 114, 156));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL:");

        txtQtd.setBackground(new java.awt.Color(210, 210, 210));

        jLabel5.setBackground(new java.awt.Color(70, 73, 75));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECIONE O CLIENTE:");

        jLabel3.setBackground(new java.awt.Color(70, 73, 75));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VALOR UNITÁRIO:");

        jLabel1.setBackground(new java.awt.Color(70, 73, 75));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECIONE PRODUTO: ");

        txtValorUnitario.setBackground(new java.awt.Color(210, 210, 210));
        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });

        txtTotalVenda.setEnabled(false);
        txtTotalVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVendaActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(70, 73, 75));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUANTIDADE:");

        btSalvar1.setBackground(new java.awt.Color(0, 204, 0));
        btSalvar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvar1.setForeground(new java.awt.Color(0, 0, 0));
        btSalvar1.setText("Salvar");
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        tbProdutos.setBackground(new java.awt.Color(210, 210, 210));
        tbProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbProdutos.setForeground(new java.awt.Color(102, 102, 102));
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Descrição", "Valor Unit", "Qtd", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tbProdutosComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(tbProdutos);

        txtCod.setBackground(new java.awt.Color(210, 210, 210));
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCod.setEnabled(false);

        txtDescricaoProduto.setBackground(new java.awt.Color(210, 210, 210));
        txtDescricaoProduto.setToolTipText("");
        txtDescricaoProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDescricaoProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDescricaoProduto.setEnabled(false);
        txtDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProdutoActionPerformed(evt);
            }
        });

        btNovoProduto.setBackground(new java.awt.Color(0, 204, 0));
        btNovoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btNovoProduto.setForeground(new java.awt.Color(0, 0, 0));
        btNovoProduto.setText("ADD PRODUTO");
        btNovoProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoProdutoActionPerformed(evt);
            }
        });

        txtCodigoCliente.setBackground(new java.awt.Color(210, 210, 210));
        txtCodigoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigoCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        txtNomeCliente1.setBackground(new java.awt.Color(210, 210, 210));
        txtNomeCliente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNomeCliente1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNomeCliente1.setEnabled(false);
        txtNomeCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCliente1ActionPerformed(evt);
            }
        });

        btNovoCliente.setBackground(new java.awt.Color(0, 204, 0));
        btNovoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btNovoCliente.setForeground(new java.awt.Color(0, 0, 0));
        btNovoCliente.setText("ADD CLIENTE");
        btNovoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoClienteActionPerformed(evt);
            }
        });

        btNovoProduto1.setBackground(new java.awt.Color(0, 204, 0));
        btNovoProduto1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btNovoProduto1.setForeground(new java.awt.Color(0, 0, 0));
        btNovoProduto1.setText("ADICIONAR ITEM NA VENDA");
        btNovoProduto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btNovoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoProduto1ActionPerformed(evt);
            }
        });

        txtObs.setBackground(new java.awt.Color(210, 210, 210));
        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(70, 73, 75));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OBS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtValorUnitario)
                            .addComponent(txtQtd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCliente1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btNovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(btNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btNovoProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObs)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNovoCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btNovoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar1)
                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btCancelar)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(569, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(115, 115, 115))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    private void txtTotalVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVendaActionPerformed
        
    }//GEN-LAST:event_txtTotalVendaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
/*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(campo[], formatter);
        Venda.setData(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
*/
//        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
//        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");         
//        String formattedDate = sdf.format(date);
//
//        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//         String timestamp = dateFormat.format(new Date());
        Venda venda = new Venda(); 
        VendaService vendaService = new VendaService();
        vendaService.insertVenda(venda); 
    
        
        venda.setObservacoes(txtObs.getText());//        "observacoes"
//        venda.setData(date);//  "data"
        venda.setTotal(Double.parseDouble(txtTotalVenda.getText()));//  "total"  
        venda.setCliente(new Cliente(clienteInsercao.id, clienteInsercao.nome, clienteInsercao.email, clienteInsercao.telefone));

        Call<Void> call = vendaService.insertVenda(venda);

        call.enqueue(new Callback<Void>() {
        @Override
        public void onResponse(Call<Void> call, Response<Void> response) {
        if (response.isSuccessful()) {
                   java.util.Date date = new java.util.Date(System.currentTimeMillis());

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
               System.out.println("Arquivo log atualizado com sucesso!");
        writer.write("OPERAÇÃO:INSERT VENDA, STATUS:SUCESSO, "+date+"\n");
        writer.newLine();
        }  catch (IOException e) {
                    
            e.printStackTrace();
        }
        
        } else {
            
    java.util.Date date = new java.util.Date(System.currentTimeMillis());

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
               System.out.println("Arquivo log atualizado com sucesso!");
        writer.write("OPERAÇÃO:INSERT VENDA, STATUS:ERRO, "+date+"\n");
        writer.newLine();
        }  catch (IOException e) {
                    
            e.printStackTrace();
        }
        }
        }
        @Override
        public void onFailure(Call<Void> call, Throwable t) {
           
         }
            });
        

        
         new Teladesucesso().setVisible(true);

          /*        Produto produto = new Produto(); 
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
            // Produto inserido com sucesso
        } else {
            // Erro ao inserir produto
        }
        }

        @Override
        public void onFailure(Call<Void> call, Throwable t) {
        // Tratar falha na requisição
         }
            });


         new Teladesucesso().setVisible(true);*/
    }//GEN-LAST:event_btSalvar1ActionPerformed

    private void tbProdutosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tbProdutosComponentAdded
       
    }//GEN-LAST:event_tbProdutosComponentAdded

    private void btNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoClienteActionPerformed
    new Tabela_Cliente().setVisible(true);
    }//GEN-LAST:event_btNovoClienteActionPerformed

    private void btNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoProdutoActionPerformed
     new Tabela_produtos().setVisible(true);
    }//GEN-LAST:event_btNovoProdutoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
 
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (clienteInsercao.id != null) {
            txtCodigoCliente.setText(clienteInsercao.id.toString());
            txtNomeCliente1.setText(clienteInsercao.nome);
        }

        if (produtoInsercao.id != null) {
            txtCod.setText(produtoInsercao.id.toString());
            txtDescricaoProduto.setText(produtoInsercao.descricao);
            txtValorUnitario.setText(produtoInsercao.preco.toString());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btNovoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoProduto1ActionPerformed
         if (txtQtd.getText().isEmpty() || txtQtd.getText().equals("0")) {
            quantidadeProduto = "1";
        } else {
            quantidadeProduto = txtQtd.getText();
        }

        valorTotal += produtoInsercao.preco * Double.parseDouble(quantidadeProduto);

        defaultTableModel.addRow(new Object[]{produtoInsercao.id.toString(),
            produtoInsercao.descricao.toString(), produtoInsercao.preco.toString(),
            quantidadeProduto, produtoInsercao.preco * Double.parseDouble(quantidadeProduto)});

         txtTotalVenda.setText(valorTotal.toString());
         
         java.util.Date date = new java.util.Date(System.currentTimeMillis());

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
               System.out.println("Arquivo log atualizado com sucesso!");
        writer.write("OPERAÇÃO:INSERINDO PRODUTO NA VENDA, STATUS:SUCESSO, "+date+"\n");
        writer.newLine();
        }  catch (IOException e) {
                    
            e.printStackTrace();
        }

    }//GEN-LAST:event_btNovoProduto1ActionPerformed

    private void txtDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoProdutoActionPerformed

    private void txtNomeCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCliente1ActionPerformed

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
       
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObsActionPerformed

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
            java.util.logging.Logger.getLogger(Venda_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda_Panel().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovoCliente;
    private javax.swing.JButton btNovoProduto;
    private javax.swing.JButton btNovoProduto1;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtNomeCliente1;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTotalVenda;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
