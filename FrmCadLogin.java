/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import controle.ControleLogin;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;
/**
 *
 * @author bookafe
 */
public class FrmCadLogin extends javax.swing.JFrame {
 ModeloLogin mod = new ModeloLogin();
 ControleLogin control = new ControleLogin();
 
 int flag=1;
    /**
     * Creates new form FrmCadLogin
     */
    public FrmCadLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldConfSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuario");

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jTextFieldCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCod.setEnabled(false);

        jLabel3.setText("Nome");

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel4.setText("Senha:");

        jPasswordFieldSenha.setText("jPasswordField1");
        jPasswordFieldSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPasswordFieldSenha.setEnabled(false);

        jLabel5.setText("Confirmacao de Senha:");

        jPasswordFieldConfSenha.setText("jPasswordField2");
        jPasswordFieldConfSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPasswordFieldConfSenha.setEnabled(false);

        jLabel6.setText("Login:");

        jTextFieldLogin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLogin.setEnabled(false);

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

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonUltimo.setText(">>");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel7.setText("Permissão");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Comum" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUltimo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonUltimo))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(805, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        mod=control.primeiro();
        jTextFieldCod.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jTextFieldLogin.setText(mod.getLogin());
        jComboBox1.setSelectedItem(mod.getPermissao());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldConfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        //jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldConfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        //jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if(flag == 1){
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfSenha.getText())){
        mod.setLogin(jTextFieldLogin.getText());
        mod.setNome(jTextFieldNome.getText());
        mod.setPermissao((String)jComboBox1.getSelectedItem());
        mod.setSenha(jPasswordFieldSenha.getText());
        control.salvar(mod);
        jTextFieldCod.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldConfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
          }else{
            JOptionPane.showMessageDialog(rootPane,"As Senhas nao conferem !!!");
        }
        
        
         }else{
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfSenha.getText())){
        mod.setId(Integer.parseInt(jTextFieldCod.getText()));
        mod.setLogin(jTextFieldLogin.getText());
        mod.setNome(jTextFieldNome.getText());
        mod.setPermissao((String)jComboBox1.getSelectedItem());
        control.alterar(mod);
        jTextFieldCod.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldConfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        flag=1;
        }else{
            JOptionPane.showMessageDialog(rootPane,"As Senhas nao conferem !!!");
           
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
}
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        mod=control.anterior();
        jTextFieldCod.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jTextFieldLogin.setText(mod.getLogin());
        jComboBox1.setSelectedItem(mod.getPermissao());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        mod=control.proximo();
        jTextFieldCod.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jTextFieldLogin.setText(mod.getLogin());
        jComboBox1.setSelectedItem(mod.getPermissao());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        mod=control.ultimo();
        jTextFieldCod.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jTextFieldLogin.setText(mod.getLogin());
        jComboBox1.setSelectedItem(mod.getPermissao());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        mod.setId(Integer.parseInt(jTextFieldCod.getText()));
        mod.setLogin(jTextFieldLogin.getText());
        mod.setNome(jTextFieldNome.getText());
        mod.setPermissao((String)jComboBox1.getSelectedItem());
        control.excluir(mod);
        jTextFieldCod.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldConfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        
        flag=2;
        jButtonSalvar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
