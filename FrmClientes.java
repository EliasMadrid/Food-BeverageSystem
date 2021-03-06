/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ModeloTabela;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import controle.ConectaBanco;
import controle.ControleCliente;
import java.sql.PreparedStatement;
import modelo.ModeloCliente;


public class FrmClientes extends javax.swing.JFrame {
   ModeloCliente mod = new ModeloCliente();
   ControleCliente control = new ControleCliente();
   ConectaBanco conn = new ConectaBanco();
   int flag = 1;
   
   
    public FrmClientes() {
        initComponents();
        try {
            MaskFormatter form = new MaskFormatter("##.###.###-##");
            jFormattedTextFieldRg.setFormatterFactory(new DefaultFormatterFactory(form));
            form = new MaskFormatter("(###.###.###-##");
            jFormattedTextFieldCPF.setFormatterFactory(new DefaultFormatterFactory(form));
            
                
        } catch (ParseException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
        }
        
       
        preencherComboboxBairro();
        preencherComboboxTelefone();
        //preencherTabela();
        preencherTabelaTeste("select * from clientes");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEnd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTelefone = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jButtonAddTelefone = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        jButtonPrimeiro.setText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");

        jButtonProximo.setText("Proximo");

        jButtonUltimo.setText("Ultimo");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Codigo:");

        jTextFieldCod.setEnabled(false);

        jLabel2.setText("Nome do Cliente:");

        jTextFieldNome.setEnabled(false);

        jLabel8.setText("Endereco:");

        jTextFieldEnd.setEnabled(false);

        jLabel4.setText("Bairro:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Rg do Cliente:");

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Cpf Cliente:");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gnome_logout.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefone");

        jComboBoxTelefone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("+");

        jFormattedTextFieldRg.setEnabled(false);

        jFormattedTextFieldCPF.setEnabled(false);

        jButtonAddTelefone.setText("+");
        jButtonAddTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTelefoneActionPerformed(evt);
            }
        });

        jLabelCidade.setText("---------------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel4))
                                            .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(jButtonAddTelefone))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(12, 12, 12))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(199, 199, 199))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonSair)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddTelefone))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 23, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPrimeiro)
                        .addGap(194, 194, 194)
                        .addComponent(jButtonAnterior)
                        .addGap(98, 98, 98)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUltimo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel3))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNovo)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonCancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonUltimo))
                .addGap(27, 27, 27))
        );

        setSize(new java.awt.Dimension(976, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmBairro frm = new FrmBairro();
        frm.setVisible(true);
        preencherCombobox();
    }//GEN-LAST:event_jButton1ActionPerformed
  public void preencherComboboxBairro(){
        conn.conexao();
        conn.executaSQL("select * from bairro order by nome_bairro");
        jComboBoxBairro.removeAllItems();
        jComboBoxTelefone.removeAllItems();
        try {
            conn.rs.first();
            do{
               jComboBoxBairro.addItem(""+conn.rs.getString("nome_bairro")); 
            }while(conn.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher os bairros!"+ ex);
        }
        conn.desconecta();
    }
   public void preencherComboboxTelefone(){
        conn.conexao();
        conn.executaSQL(" select * from telefone order by numero_tel");
        jComboBoxTelefone.removeAllItems();
        try {
            conn.rs.first();
            do{
               jComboBoxTelefone.addItem(""+conn.rs.getString("numero_tel")); 
            }while(conn.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher os telefones!"+ ex);
        }
        conn.desconecta();
    }
    public void preencherCombobox(){
        
        
        conn.conexao();
        conn.executaSQL("select * from bairro order by nome_bairro");
        jComboBoxBairro.removeAllItems();
        jComboBoxTelefone.removeAllItems();
        try {
            conn.rs.first();
            do{
               jComboBoxBairro.addItem(""+conn.rs.getString("nome_bairro")); 
            }while(conn.rs.next());
            
               conn.executaSQL(" select * from telefone order by numero_tel");
               conn.rs.first(); 
            do{
                
               jComboBoxTelefone.addItem(""+conn.rs.getString("numero_tel")); 
            }while(conn.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jButtonAnterior,"Erro ao preencher os bairros!"+ ex);
        }
        conn.desconecta();
    }
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldEnd.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRg.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTextFieldEnd.setText("");
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAddTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTelefoneActionPerformed
        // TODO add your handling code here:
        FrmTelefone frm = new FrmTelefone();
        frm.setVisible(true);
        preencherCombobox();
    }//GEN-LAST:event_jButtonAddTelefoneActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:y
        if (flag == 1){
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco((jTextFieldEnd.getText()));
            mod.setRg(jFormattedTextFieldRg.getText());
            mod.setCpf(jFormattedTextFieldCPF.getText());
            mod.setBairro((String) jComboBoxBairro.getSelectedItem());
            mod.setCidade((String)   jLabelCidade.getText());
            mod.setTelefone((String) jComboBoxTelefone.getSelectedItem());
            control.Inserir(mod);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jTextFieldEnd.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCPF.setEnabled(!true);
        jFormattedTextFieldRg.setEnabled(!true);
        jButtonNovo.setEnabled(false);
        jTextFieldEnd.setText("");
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        preencherCombobox();
        preencherTabela();
        } else{
            mod.setId(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco((jTextFieldEnd.getText()));
            mod.setRg(jFormattedTextFieldRg.getText());
            mod.setCpf(jFormattedTextFieldCPF.getText());
            mod.setBairro((String) jComboBoxBairro.getSelectedItem());
            mod.setCidade((String)   jLabelCidade.getText());
            mod.setTelefone((String) jComboBoxTelefone.getSelectedItem());
            control.alterar(mod);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jTextFieldEnd.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCPF.setEnabled(!true);
        jFormattedTextFieldRg.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jTextFieldEnd.setText("");
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        flag = 1;
        preencherCombobox();
        preencherTabela();
            
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        jTextFieldEnd.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRg.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        flag = 2;
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
            mod.setId(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco((jTextFieldEnd.getText()));
            mod.setRg(jFormattedTextFieldRg.getText());
            mod.setCpf(jFormattedTextFieldCPF.getText());
            mod.setBairro((String) jComboBoxBairro.getSelectedItem());
            mod.setCidade((String)   jLabelCidade.getText());
            mod.setTelefone((String) jComboBoxTelefone.getSelectedItem());
            control.Excluir(mod);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jTextFieldEnd.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCPF.setEnabled(!true);
        jFormattedTextFieldRg.setEnabled(!true);
        jButtonNovo.setEnabled(false);
        jTextFieldEnd.setText("");
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        preencherCombobox();
        preencherTabela();
    }//GEN-LAST:event_jButtonExcluirActionPerformed
      public void preencherTabelaTeste(String SQL){
       ArrayList dados = new ArrayList();
       
       String[] Colunas = new String[] {"Cliente", "Endereco"};
               conn.conexao();
               conn.executaSQL(SQL);
               try{
                  conn.rs.first();
                  do{
                       //dados.add(new Object[]{conn.rs.getString("nome_cliente"), conn.rs.getString("endereco_cliente"), conn.rs.getString("numero_tel"), conn.rs.getString("nome_cidade")});
                       dados.add(new Object[]{conn.rs.getString("nome_cliente"), conn.rs.getString("endereco_cliente")});
                  }while(conn.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableClientes.setModel(modelo);
               jTableClientes.getColumnModel ().getColumn(0).setPreferredWidth(60);
               jTableClientes.getColumnModel().getColumn(0).setResizable(false);
               jTableClientes.getColumnModel ().getColumn(1).setPreferredWidth(240);
               jTableClientes.getColumnModel().getColumn(1).setResizable(false);                     
               jTableClientes.getTableHeader().setReorderingAllowed(false);
               jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
               jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               conn.desconecta();
               
                
       }
    public void preencherTabela(){
       
       ArrayList dados = new ArrayList();
       
       String[] Colunas = new String[] {"Cliente", "Endereco", "Telefone", "Cidade"};
               conn.conexao();
               conn.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente\n" +
                        "inner join telefone on itens_cli_tel.id_tel=telefone.id_telefone\n" +
                        "inner join bairro on clientes.id_bairro=bairro.id_bairro \n" +
                        "inner join cidade on bairro.id_cidade=cidade.id_cidade");
               try{
                  conn.rs.first();
                  do{
                      
                      dados.add(new Object[]{conn.rs.getString("nome_cliente"), conn.rs.getString("endereco_cliente"), conn.rs.getString("numero_tel"), conn.rs.getString("nome_cidade")});
              }while(conn.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableClientes.setModel(modelo);
               jTableClientes.getColumnModel ().getColumn(0).setPreferredWidth(110);
               jTableClientes.getColumnModel().getColumn(0).setResizable(false);
               jTableClientes.getColumnModel ().getColumn(1).setPreferredWidth(380);
               jTableClientes.getColumnModel().getColumn(1).setResizable(false);
               jTableClientes.getColumnModel ().getColumn(2).setPreferredWidth(315);
               jTableClientes.getColumnModel().getColumn(2).setResizable(false);
               jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(315);
               jTableClientes.getColumnModel().getColumn(3).setResizable(false);
               jTableClientes.getTableHeader().setReorderingAllowed(false);
               jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
               jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               conn.desconecta();
                
       }
    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
       
        
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        mod = control.Primeiro();
        jTextFieldEnd.setText(mod.getEndereco());
        jTextFieldNome.setText(mod.getNome());
        jTextFieldCod.setText(String.valueOf(mod.getId()));
        jFormattedTextFieldCPF.setText(mod.getCpf());
        jFormattedTextFieldRg.setText(mod.getRg());
        jComboBoxBairro.setSelectedItem(mod.getBairro());
        jLabelCidade.setText(mod.getCidade());
        jComboBoxTelefone.setSelectedItem(mod.getTelefone());
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed
   
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
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddTelefone;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox jComboBoxBairro;
    private javax.swing.JComboBox jComboBoxTelefone;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    
}
