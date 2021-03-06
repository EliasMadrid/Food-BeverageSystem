/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import controle.ConectaBanco;
import controle.ControleBairro;
import controle.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloBairro;

public class FrmBairro extends javax.swing.JFrame {

    
    ConectaBanco conn = new ConectaBanco();
    ControleBairro control = new ControleBairro();
     ModeloBairro mod = new ModeloBairro();
     int flag = 1;
    
    public FrmBairro() {
        initComponents();
        conn.conexao();
        preencherTabela("select * from bairro inner join cidade on bairro.id_cidade = cidade.id_cidade");
        AtualizarCombo();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBairro = new javax.swing.JTable();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Bairros");
        setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Cidade:");

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldNome.setEnabled(false);

        jTextFieldCod.setDragEnabled(false);
        jTextFieldCod.setEnabled(false);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 153, 255));
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

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText("Ultimo");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jTableBairro.setBackground(new java.awt.Color(51, 153, 255));
        jTableBairro.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jTableBairro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableBairro);

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText("Proximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNovo)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrimeiro)
                            .addComponent(jButtonUltimo)
                            .addComponent(jButtonAnterior)
                            .addComponent(jButtonProximo))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)
                        .addGap(15, 15, 15))))
        );

        setSize(new java.awt.Dimension(762, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (flag == 1){ 
            mod.setNome(jTextFieldNome.getText());
            mod.setCidade(""+ jComboBoxCidade.getSelectedItem());
            control.Gravar(mod);
            preencherTabela("select * from bairro inner join estados on bairro.id_cidade = cidade.id_cidade");
        } else { 
            mod.setNome(jTextFieldNome.getText());
            mod.setCidade(""+ jComboBoxCidade.getSelectedItem());
            control.AlteraBairro(mod);
            preencherTabela("select * from bairro inner join estados on bairro.id_cidade = cidade.id_cidade");
        }   
        jTextFieldNome.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
//        jButtonExcluir.setEnabled(true);
//        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(true);  
        jButtonNovo.setEnabled(false);
       
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        mod.setCod(Integer.parseInt(jTextFieldCod.getText()));
        control.ExcluirBairro(mod);
        jTextFieldNome.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        preencherTabela("select * from bairro inner join cidade on bairro.id_cidade = cidade.id_cidade");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(!true);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        mod = control.Primeiro();
        jTextFieldCod.setText(String.valueOf(mod.getCod()));
        jTextFieldNome.setText(mod.getNome());
        jComboBoxCidade.setSelectedItem(mod.getCidade());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        mod = control.Ult();
        jTextFieldCod.setText(String.valueOf(mod.getCod()));
        jTextFieldNome.setText(mod.getNome());
        jComboBoxCidade.setSelectedItem(mod.getCidade());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        mod = control.Ant();
        jTextFieldCod.setText(String.valueOf(mod.getCod()));
        jTextFieldNome.setText(mod.getNome());
        jComboBoxCidade.setSelectedItem(mod.getCidade());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        mod = control.Prox();
        jTextFieldCod.setText(String.valueOf(mod.getCod()));
        jTextFieldNome.setText(mod.getNome());
        jComboBoxCidade.setSelectedItem(mod.getCidade());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmCidade frm = new FrmCidade();
        frm.setVisible(true);
        AtualizarCombo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

   public void preencherTabela(String SQL){
       ArrayList dados = new ArrayList();
       
       String [] Colunas = new String[] {"ID", "Bairro", "Cidade"};
               //conn.conexao();
               conn.executaSQL(SQL);
               try{
                  conn.rs.first();
                  do{
                      dados.add(new Object[]{conn.rs.getInt("id_cidade"), conn.rs.getString("nome_bairro"), conn.rs.getString("nome_cidade")});
              }while(conn.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableBairro.setModel(modelo);
               jTableBairro.getColumnModel ().getColumn(0).setPreferredWidth(110);
               jTableBairro.getColumnModel().getColumn(0).setResizable(false);
               jTableBairro.getColumnModel ().getColumn(1).setPreferredWidth(380);
               jTableBairro.getColumnModel().getColumn(1).setResizable(false);
               jTableBairro.getColumnModel ().getColumn(2).setPreferredWidth(115);
               jTableBairro.getColumnModel().getColumn(2).setResizable(false);
               jTableBairro.getTableHeader().setReorderingAllowed(false);
               jTableBairro.setAutoResizeMode(jTableBairro.AUTO_RESIZE_OFF);
               jTableBairro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               conn.desconecta();
               
             
                
       }
   public void AtualizarCombo(){
      jComboBoxCidade.removeAllItems();
      try{
          conn.executaSQL("select * from cidade order by nome_cidade");
          conn.rs.first();
      
          do{
              jComboBoxCidade.addItem(conn.rs.getString("nome_cidade"));
          }while(conn.rs.next());
               
   }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a Combobox! n ERRO:"+ex);
                   } 
      }
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
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBairro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBairro;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

   
}
