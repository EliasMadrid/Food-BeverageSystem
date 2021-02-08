
package visao;

import controle.ConectaBanco;
import controle.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;



public class FrmEstado extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    
    public FrmEstado() {
        initComponents();
        conecta.conexao();
        preencherTabela("select * from estados order by id_estado");
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSigla = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro_de_Estados");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Sigla:");

        jTextFieldCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCod.setEnabled(false);

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jTextFieldSigla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldSigla.setEnabled(false);
        jTextFieldSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSiglaActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        jButtonAlterar.setText("Atualizar");
        jButtonAlterar.setToolTipText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonDeletar.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        jButtonDeletar.setText("Excluir");
        jButtonDeletar.setToolTipText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gnome_logout.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableEstado);

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

        jButtonAnterior.setText("anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText("proximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButtonPrimeiro)
                .addGap(34, 34, 34)
                .addComponent(jButtonUltimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAnterior)
                .addGap(47, 47, 47)
                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonSair))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonNovo))
                        .addComponent(jButtonAlterar))
                    .addComponent(jButtonDeletar))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPrimeiro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonUltimo)
                        .addComponent(jButtonAnterior)
                        .addComponent(jButtonProximo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Formulario de cadastro de estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(619, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSiglaActionPerformed
       
    }//GEN-LAST:event_jTextFieldSiglaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into estados (nome_estado,sigla_estado)values(?,?)");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldSigla.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Salvo com suscesso!");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar n ERRO:"+ex);
        }
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jTextFieldSigla.setText("");
        jTextFieldNome.setEnabled(false);
        jTextFieldSigla.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
//        conecta.executaSQL("delete from estados where sigla_estado='"+ jTextFieldSigla.getText()+"'");
//        JOptionPane.showMessageDialog(rootPane, "Excluido com suscesso!");
     
        try{
          PreparedStatement pst =conecta.conn.prepareStatement("delete from estados where sigla_estado=?"); 
          pst.setString(1, jTextFieldSigla.getText());
          pst.execute();
           JOptionPane.showMessageDialog(rootPane, "Excluido com suscesso!");
           preencherTabela("select * from estados order by id_estado");
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar! n ERRO:"+ex);
        }
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jTextFieldSigla.setText("");
        jTextFieldNome.setEnabled(false);
        jTextFieldSigla.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
            
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jTextFieldSigla.setText("");
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        
        try {
            conecta.executaSQL("select * from estados");
            conecta.rs.first();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados:"+ex);
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        try {
            conecta.executaSQL("select * from estados");
            conecta.rs.last();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados:"+ex);
        }   
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        try {
            conecta.rs.previous();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
           
        }
             
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        try {
            conecta.rs.next();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
           
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
        try{
          PreparedStatement pst =conecta.conn.prepareStatement("update estados set nome_estado=?, sigla_estado=? where id_estado=?"); 
          pst.setString(1, jTextFieldNome.getText());
          pst.setString(2, jTextFieldSigla.getText());
          pst.setInt(3, Integer.parseInt(jTextFieldCod.getText()) );
          pst.execute();
           JOptionPane.showMessageDialog(rootPane, "Alterados com suscesso!");
           preencherTabela("select * from estados order by id_estado");
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro ao alterarr! n ERRO:"+ex);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed
   public void preencherTabela(String SQL){
       ArrayList dados = new ArrayList();
       
       String [] Colunas = new String[] {"ID", "Nome", "Sigla"};
               conecta.executaSQL(SQL);
               try{
                  conecta.rs.first();
                  do{
                      dados.add(new Object[]{conecta.rs.getInt("id_estado"), conecta.rs.getString("nome_estado"), conecta.rs.getString("sigla_estado")});
              }while(conecta.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableEstado.setModel(modelo);
               jTableEstado.getColumnModel ().getColumn(0).setPreferredWidth(110);
               jTableEstado.getColumnModel().getColumn(0).setResizable(false);
               jTableEstado.getColumnModel ().getColumn(1).setPreferredWidth(380);
               jTableEstado.getColumnModel().getColumn(1).setResizable(false);
               jTableEstado.getColumnModel ().getColumn(2).setPreferredWidth(115);
               jTableEstado.getColumnModel().getColumn(2).setResizable(false);
               jTableEstado.getTableHeader().setReorderingAllowed(false);
               jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
               jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
       }

   
   
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSigla;
    // End of variables declaration//GEN-END:variables

   
}
 



