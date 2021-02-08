/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConectaBanco;
import controle.ModeloTabela;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author bookafe
 */
public class FrmPesquisaVenda extends javax.swing.JFrame {
    ConectaBanco conn = new ConectaBanco();

    /**
     * Creates new form FrmPesquisaVenda
     */
    public FrmPesquisaVenda() {
        initComponents();
        
        try {
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldPesquisar.setFormatterFactory(new DefaultFormatterFactory(form));      
        } catch (ParseException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
     }
      
    }
    public void preencherTabela(String sql){
       ArrayList dados = new ArrayList();
       
       String [] Colunas = new String[] {"ID", "Data Venda","Valor da venda","Cliente"};
               conn.conexao();
               conn.executaSQL(sql);
               //conn.executaSQL("select * from clientes where nome_cliente =%'"+jTextFieldCliente.getText()+"'%");
               try{
                  conn.rs.first();
                  do{
                      dados.add(new Object[]{conn.rs.getInt("id_venda"), conn.rs.getString("data_venda"),conn.rs.getString("valor_venda"),conn.rs.getString("nome_cliente")});
              }while(conn.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               tabela.setModel(modelo);
               tabela.getColumnModel ().getColumn(0).setPreferredWidth(50);
               tabela.getColumnModel().getColumn(0).setResizable(false);
               tabela.getColumnModel ().getColumn(1).setPreferredWidth(100);
               tabela.getColumnModel().getColumn(1).setResizable(false);
               tabela.getColumnModel ().getColumn(2).setPreferredWidth(100);
               tabela.getColumnModel().getColumn(2).setResizable(false);
               tabela.getColumnModel ().getColumn(3).setPreferredWidth(250);
               tabela.getColumnModel().getColumn(3).setResizable(false);
               tabela.getTableHeader().setReorderingAllowed(false);
               tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
               tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
       }
     public void preencherTabelaDetalhes(String sql){
       ArrayList dados = new ArrayList();
       
       String [] Colunas = new String[] {"Produtos", "Quantidade"};
               conn.conexao();
               conn.executaSQL(sql);
               //conn.executaSQL("select * from clientes where nome_cliente =%'"+jTextFieldCliente.getText()+"'%");
               try{
                  conn.rs.first();
                  do{
                      dados.add(new Object[]{conn.rs.getString("nome_produto"), conn.rs.getString("quantidade")});
              }while(conn.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               tabela.setModel(modelo);
               tabela.getColumnModel ().getColumn(0).setPreferredWidth(200);
               tabela.getColumnModel().getColumn(0).setResizable(false);
               tabela.getColumnModel ().getColumn(1).setPreferredWidth(100);
               tabela.getColumnModel().getColumn(1).setResizable(false);
               tabela.getTableHeader().setReorderingAllowed(false);
               tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
               tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
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
        jButtonPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDetalhes = new javax.swing.JTable();
        jFormattedTextFieldPesquisar = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite uma data:");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Vendas recebidas:");

        jLabel3.setText("Detalhes da venda:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        tabelaDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaDetalhes);

        jFormattedTextFieldPesquisar.setText("jFormattedTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPesquisar)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jFormattedTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        preencherTabela("select * from venda inner join clientes on venda.id_cliente = clientes.id_cliente where data_venda ='"+jFormattedTextFieldPesquisar.getText()+"'");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        int cod =(int) tabela.getValueAt(tabela.getSelectedRow(), 0);
        preencherTabelaDetalhes("select * from venda inner join itens_venda_produto\n" +
"on venda.id_venda = itens_venda_produto.id_venda inner join produto\n" +
"on itens_venda_produto.id_produto = produto.id_produto where venda.id_venda="+cod);
    }//GEN-LAST:event_tabelaMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPesquisaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaDetalhes;
    // End of variables declaration//GEN-END:variables
}