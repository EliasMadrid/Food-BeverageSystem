/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConectaBanco;
import java.sql.SQLException;
import controle.ControleProduto;
import controle.ModeloTabela;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloProduto;

public class FrmProduto extends javax.swing.JFrame {
    ConectaBanco conexao = new ConectaBanco();
    ConectaBanco conexaoPesquisa = new ConectaBanco();
    modelo.ModeloProduto mod= new ModeloProduto();
    ControleProduto control = new ControleProduto();
   
   
    public FrmProduto() {
        initComponents();
        preencherCombo();
        preencherTabela("select * from produto ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCompras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrecodeVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPesq = new javax.swing.JButton();
        jButtonAddFornecedor = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel2.setText("Cod:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel3.setText("Produto:");

        jTextFieldCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCod.setEnabled(false);

        jTextFieldProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldProduto.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel4.setText("Quantidade:");

        jTextFieldQtd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQtd.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel5.setText("Preco de compra:");

        jTextFieldCompras.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCompras.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel6.setText("Preco de vendas:");

        jTextFieldPrecodeVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPrecodeVenda.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel7.setText("Fornecedor:");

        jComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Tabela.setBackground(new java.awt.Color(51, 153, 255));
        Tabela.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jButtonNovo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPesq.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButtonPesq.setText("Pesquisar");
        jButtonPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesqActionPerformed(evt);
            }
        });

        jButtonAddFornecedor.setText("+");
        jButtonAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFornecedorActionPerformed(evt);
            }
        });

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DESSERT", "HOT DRINK", "COLD DRINK", "WINE", "CHAMPAGNE", "DISH", " " }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel8.setText("Categoria:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bookafes figurinha.jpeg"))); // NOI18N
        jLabel11.setText("Cidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPrecodeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAddFornecedor)))
                                        .addGap(18, 18, 18))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jButtonPesq)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddFornecedor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPrecodeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesq, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNovo)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gnome_logout.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        setSize(new java.awt.Dimension(1028, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        mod.setCategoria((String)jComboBoxCategoria.getSelectedItem());
        mod.setFornecedorProduto((String) jComboBoxFornecedor.getSelectedItem());
        mod.setNomeProduto(jTextFieldProduto.getText());
        mod.setPrecoCompra(Float.parseFloat(jTextFieldCompras.getText()));
        mod.setPrecoVenda(Float.parseFloat(jTextFieldPrecodeVenda.getText()));
        mod.setQtdProduto(Integer.parseInt(jTextFieldQtd.getText()));
        control.inserirProduto(mod);
        jTextFieldProduto.setEnabled(!true);
        jTextFieldQtd.setEnabled(!true);
        jTextFieldCompras.setEnabled(!true);
        jTextFieldPrecodeVenda.setEnabled(!true);
        jTextFieldCod.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldProduto.setText("");
        jTextFieldCompras.setText("");
        jTextFieldPrecodeVenda.setText("");
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        preencherTabela("select * from produto ");
        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFornecedorActionPerformed
        // TODO add your handling code here:
        FrmFornecedor frm = new FrmFornecedor();
        frm.setVisible(true);
        preencherCombo();
        preencherTabela("select * from produto ");
    }//GEN-LAST:event_jButtonAddFornecedorActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesqActionPerformed
        // TODO add your handling code here:
//        mod.setPesquisa(jTextFieldPesquisar.getText());
//        ModeloProduto model = control.buscaProduto(mod);
//        jTextFieldCod.setText(String.valueOf(model.getIdProduto()));
//        jTextFieldProduto.setText(model.getNomeProduto());
//        jTextFieldQtd.setText(String.valueOf(model.getQtdProduto()));
//        jTextFieldCompras.setText(String.valueOf(model.getPrecoCompra()));
//        jTextFieldPrecodeVenda.setText(String.valueOf(model.getPrecoVenda()));
//        jComboBoxFornecedor.setSelectedItem(model.getFornecedorProduto());
        jButtonEditar.setEnabled(true);
        
        
        preencherTabela("select * from produto where nome_produto like '%" +jTextFieldPesquisar.getText()+ "%'");
        
    }//GEN-LAST:event_jButtonPesqActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        mod.setIdProduto(Integer.parseInt(jTextFieldCod.getText()));
        mod.setFornecedorProduto((String) jComboBoxFornecedor.getSelectedItem());
        mod.setNomeProduto(jTextFieldProduto.getText());
        mod.setPrecoCompra(Float.parseFloat(jTextFieldCompras.getText()));
        mod.setPrecoVenda(Float.parseFloat(jTextFieldPrecodeVenda.getText()));
        mod.setQtdProduto(Integer.parseInt(jTextFieldQtd.getText()));
        control.editarProduto(mod);
        jTextFieldProduto.setEnabled(!true);
        jTextFieldQtd.setEnabled(!true);
        jTextFieldCompras.setEnabled(!true);
        jTextFieldPrecodeVenda.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        jTextFieldCod.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldProduto.setText("");
        jTextFieldCompras.setText("");
        jTextFieldPrecodeVenda.setText("");       
        preencherTabela("select * from produto ");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        mod.setIdProduto(Integer.parseInt(jTextFieldCod.getText()));
        control.ExcluirProduto(mod);
        jTextFieldProduto.setEnabled(!true);
        jTextFieldQtd.setEnabled(!true);
        jTextFieldCompras.setEnabled(!true);
        jTextFieldPrecodeVenda.setEnabled(!true);
        jTextFieldCod.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldProduto.setText("");
        jTextFieldCompras.setText("");
        jTextFieldPrecodeVenda.setText("");
        jTextFieldQtd.setText("");
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        preencherTabela("select * from produto ");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldProduto.setEnabled(true);
        jTextFieldQtd.setEnabled(true);
        jTextFieldCompras.setEnabled(true);
        jTextFieldPrecodeVenda.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldProduto.setText("");
        jTextFieldCompras.setText("");
        jTextFieldPrecodeVenda.setText("");
        jTextFieldQtd.setText("");
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
         jTextFieldProduto.setEnabled(!true);
        jTextFieldQtd.setEnabled(!true);
        jTextFieldCompras.setEnabled(!true);
        jTextFieldPrecodeVenda.setEnabled(!true);
        jTextFieldCod.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldProduto.setText("");
        jTextFieldCompras.setText("");
        jTextFieldPrecodeVenda.setText("");
        jTextFieldQtd.setText("");
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        // TODO add your handling code here:
        String nome_produto = "" +Tabela.getValueAt(Tabela.getSelectedRow(),0); 
       
        conexao.conexao();
        conexaoPesquisa.conexao();
        conexao.executaSQL("select * from produto where nome_produto='"+nome_produto+"'");
        
        try {           
            conexao.rs.first();
            jTextFieldCod.setText(String.valueOf(conexao.rs.getInt("id_produto")));
            jTextFieldProduto.setText(conexao.rs.getString("nome_produto"));
            jTextFieldQtd.setText(String.valueOf(conexao.rs.getInt("quantidade")));
            jTextFieldCompras.setText(String.valueOf(conexao.rs.getFloat("preco_compra")));
            jTextFieldPrecodeVenda.setText(String.valueOf(conexao.rs.getFloat("preco_venda")));
            conexaoPesquisa.executaSQL("select * from fornecedores where id_fornecedor=" +conexao.rs.getInt("id_fornecedor"));          
            conexaoPesquisa.rs.first();
            jComboBoxFornecedor.setSelectedItem(conexaoPesquisa.rs.getString("nome_fornecedor"));
            conexaoPesquisa.desconecta();
            conexao.desconecta();
            jTextFieldProduto.setEnabled(true);
            jTextFieldQtd.setEnabled(true);
            jTextFieldCompras.setEnabled(true);
            jTextFieldPrecodeVenda.setEnabled(true);
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);               
        } catch (SQLException s) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ao selecionar os dados! n ERRO:"+s);
            conexaoPesquisa.desconecta();
            conexao.desconecta();
        }
        //JOptionPane.showMessageDialog(rootPane,nome_produto);
    }//GEN-LAST:event_TabelaMouseClicked

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed
public void preencherCombo(){
    conexao.conexao();
    conexao.executaSQL("select * from fornecedores order by nome_fornecedor");
    jComboBoxFornecedor.removeAllItems();
        try {
            conexao.rs.first();
            
            do{
              jComboBoxFornecedor.addItem(conexao.rs.getString("nome_fornecedor"));
            }while(conexao.rs.next());
            conexao.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane," Erro ao preencher combobox"+ ex);
            conexao.desconecta();
        }
        

}

public void preencherTabela(String SQL){
    
       ArrayList dados = new ArrayList();      
       String [] Colunas = new String[] {"Nome Produto", "Quantidade", "Preco Produto"};
       
               conexao.conexao();
               conexao.executaSQL(SQL);
               try{
                  conexao.rs.first();
                  do{
                      dados.add(new Object[]{conexao.rs.getString("nome_produto"), conexao.rs.getString("quantidade"), conexao.rs.getString("preco_venda")});
              }while(conexao.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               Tabela.setModel(modelo);
               Tabela.getColumnModel ().getColumn(0).setPreferredWidth(110);
               Tabela.getColumnModel().getColumn(0).setResizable(false);
               Tabela.getColumnModel ().getColumn(1).setPreferredWidth(380);
               Tabela.getColumnModel().getColumn(1).setResizable(false);
               Tabela.getColumnModel ().getColumn(2).setPreferredWidth(115);
               Tabela.getColumnModel().getColumn(2).setResizable(false);
               Tabela.getTableHeader().setReorderingAllowed(false);
               Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
               Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               conexao.desconecta();
                
       }
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
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButtonAddFornecedor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesq;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCategoria;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCompras;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPrecodeVenda;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQtd;
    // End of variables declaration//GEN-END:variables
}
