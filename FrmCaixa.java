/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import javax.swing.*;
import modelo.ModeloCaixa;
import controle.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author bookafe
 */
public class FrmCaixa extends javax.swing.JFrame {
    ConectaBanco conexao = new ConectaBanco();
    modelo.ModeloCaixa mod= new ModeloCaixa();
    

    /**
     * Creates new form FrmCaixa
     */
    public FrmCaixa() {
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
        jButtonFecharCaixa = new javax.swing.JButton();
        jButtonSaida = new javax.swing.JButton();
        jTextFieldEntrada = new javax.swing.JTextField();
        jButtonAbrirCaixa = new javax.swing.JButton();
        jTextFieldSaldoInicial = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldValor1 = new javax.swing.JTextField();
        jTextFieldValor2 = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonSalvarSaida = new javax.swing.JButton();
        jPanelsaidas = new javax.swing.JPanel();
        jTextFieldsaidCart = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSaidaDinheiro = new javax.swing.JTextField();
        jLabelTotal1 = new javax.swing.JLabel();
        jTextFieldDepositoUbs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldempresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSaidaUbs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanelentrada = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCartao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDinheiro = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de fechamento de caixa");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caputino.jpeg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButtonFecharCaixa.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N
        jButtonFecharCaixa.setText("Fechar Caixa");
        jButtonFecharCaixa.setEnabled(false);
        jButtonFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharCaixaActionPerformed(evt);
            }
        });

        jButtonSaida.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N
        jButtonSaida.setText("Saidas");
        jButtonSaida.setEnabled(false);
        jButtonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaidaActionPerformed(evt);
            }
        });

        jButtonAbrirCaixa.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N
        jButtonAbrirCaixa.setText("Abrir Caixa");
        jButtonAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirCaixaActionPerformed(evt);
            }
        });

        jTextFieldSaldoInicial.setEnabled(false);
        jTextFieldSaldoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSaldoInicialMouseClicked(evt);
            }
        });
        jTextFieldSaldoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoInicialActionPerformed(evt);
            }
        });

        jTextFieldData.setEnabled(false);
        jTextFieldData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldDataMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldDataMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldDataMouseEntered(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(jButtonFecharCaixa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSaida)
                            .addComponent(jButtonAbrirCaixa))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSaldoInicial)))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(1361, 1361, 1361)
                .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAbrirCaixa)
                        .addComponent(jTextFieldSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaida)
                    .addComponent(jButtonFecharCaixa))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton2.setText("Soma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1976, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jButtonSalvarSaida.setText("Salvar");

        jPanelsaidas.setBackground(new java.awt.Color(153, 153, 153));
        jPanelsaidas.setEnabled(false);

        jTextFieldsaidCart.setEnabled(false);

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Saida em dinheiro:");

        jTextFieldSaidaDinheiro.setEnabled(false);

        jLabelTotal1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabelTotal1.setForeground(new java.awt.Color(102, 0, 0));
        jLabelTotal1.setText("Empresa:");

        jTextFieldDepositoUbs.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextFieldDepositoUbs.setEnabled(false);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Saida ubs");

        jTextFieldempresa.setEnabled(false);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Depósito ubs");

        jTextFieldSaidaUbs.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextFieldSaidaUbs.setEnabled(false);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Saida em Cartão:");

        javax.swing.GroupLayout jPanelsaidasLayout = new javax.swing.GroupLayout(jPanelsaidas);
        jPanelsaidas.setLayout(jPanelsaidasLayout);
        jPanelsaidasLayout.setHorizontalGroup(
            jPanelsaidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldempresa, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldSaidaUbs, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldSaidaDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldsaidCart, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelTotal1))
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldDepositoUbs))
        );
        jPanelsaidasLayout.setVerticalGroup(
            jPanelsaidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsaidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldsaidCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSaidaDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSaidaUbs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDepositoUbs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanelentrada.setBackground(new java.awt.Color(153, 153, 153));
        jPanelentrada.setEnabled(false);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entrada em Cartão:");

        jTextFieldCartao.setEnabled(false);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entrada em dinheiro:");

        jTextFieldDinheiro.setEnabled(false);

        jLabelTotal.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(102, 0, 0));
        jLabelTotal.setText("Total:");

        jTextFieldValorTotal.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextFieldValorTotal.setEnabled(false);

        javax.swing.GroupLayout jPanelentradaLayout = new javax.swing.GroupLayout(jPanelentrada);
        jPanelentrada.setLayout(jPanelentradaLayout);
        jPanelentradaLayout.setHorizontalGroup(
            jPanelentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelentradaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldCartao, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldDinheiro))
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelentradaLayout.setVerticalGroup(
            jPanelentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelentradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSalvarSaida)
                        .addGap(165, 165, 165)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldValor1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jTextFieldValor2)
                    .addComponent(jTextFieldResultado))
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelsaidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355)
                        .addComponent(jPanelentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvarSaida)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelsaidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        setSize(new java.awt.Dimension(918, 695));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharCaixaActionPerformed
        // TODO add your handling code here:
        jPanelentrada.setEnabled(true);
        jTextFieldCartao.setEnabled(true);
        jTextFieldDinheiro.setEnabled(true);
        jTextFieldValorTotal.setEnabled(true);
        
//        conexao.conexao();
//        
//        try {
//            PreparedStatement pst =  conexao.conn.prepareStatement("insert into caixa(saldo_inicial,cartao,dinheiro,saida,"
//                    + "deposito_ubs,entrada,status_saldo,manipuladores do caixa,media_vendas)"
//                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//            //pst.setFloat(1, jTextFieldNome.getText());
//          
//            pst.setString(1, jTextFieldSaldoInicial.getText());
//         
//            pst.setFloat(2,mod.getValorcartao());
//            pst.setFloat(3,mod.getValordinheiro());
//            pst.setFloat(4,mod.getSaida());
//            pst.setFloat(5,mod.getDepositoBanco());
//            pst.setFloat(6,mod.getEntradaReal());
//            pst.setString(7,mod.getStatusCaixa());
//            pst.setString(8,mod.getManipuladoresCaixa());
//            pst.setFloat(9,mod.getMediasVendas());
//            pst.execute();
//             JOptionPane.showMessageDialog(null,"Produto Cadastrado com sucesso");
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Erro ao inserir o produto"+ex);
//        }
//        conexao.desconecta();
       //------------------------------//////////---------------------------------
        /*JOptionPane.showInputDialog("Digite a data de hoje:");
        mod.setSaldoInicial(Float.parseFloat(JOptionPane.showInputDialog("digite o valor do Saldo inicial:")));
        mod.setValorcartao(Float.parseFloat(JOptionPane.showInputDialog("digite quanto a maquina registrou no cartão:")));
        mod.setValordinheiro(Float.parseFloat(JOptionPane.showInputDialog("digite quanto a maquina registrou em dinheiro:")));
        //total
        mod.setSaida(Float.parseFloat(JOptionPane.showInputDialog("digite o valor total da saida")));
        mod.setDepositoBanco(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do deposito")));
        mod.setEntradaReal(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da entrada real de dinheiro:")));
        //saldo do cofre
        //status do saldo
        mod.setManipuladoresCaixa(JOptionPane.showInputDialog("Digite as pessoas que manipularam o caixa hoje:"));
        //media
        
       */
        
       
       // setCartao(Double.parseDouble(JOptionPane.showInputDialog("digite o vaor de entrado do cartao:")));
        
        
    }//GEN-LAST:event_jButtonFecharCaixaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int num1,num2,res;
        num1 = Integer.parseInt(jTextFieldValor1.getText());
        num2 = Integer.parseInt(jTextFieldValor2.getText());
        res = num1 + num2;
        jTextFieldResultado.setText(String.valueOf(res));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirCaixaActionPerformed
       jTextFieldSaldoInicial.setText("");
        jButtonSaida.setEnabled(true);
        //mod.setSaldoInicial(Float.parseFloat(JOptionPane.showInputDialog("digite o valor do Saldo inicial:")));
        JOptionPane.showMessageDialog(rootPane,"digite o valor do saldo inicial e a data de hoje:");
        jTextFieldSaldoInicial.setEnabled(true);
        jButtonFecharCaixa.setEnabled(true);
        
    }//GEN-LAST:event_jButtonAbrirCaixaActionPerformed

    private void jTextFieldSaldoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSaldoInicialMouseClicked
        // TODO add your handling code here:
        jTextFieldData.setEnabled(true);
    }//GEN-LAST:event_jTextFieldSaldoInicialMouseClicked

    private void jTextFieldSaldoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoInicialActionPerformed

    private void jTextFieldDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDataMouseClicked
        // TODO add your handling code here:
        jTextFieldSaldoInicial.setEnabled(false);
        jButtonAbrirCaixa.setEnabled(false);
        
    }//GEN-LAST:event_jTextFieldDataMouseClicked

    private void jTextFieldDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDataMouseExited
        // TODO add your handling code here:
        //jTextFieldSaldoInicial.setEnabled(false);
    }//GEN-LAST:event_jTextFieldDataMouseExited

    private void jTextFieldDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDataMouseEntered
        // TODO add your handling code here:
        //jTextFieldData.setEnabled(false);
    }//GEN-LAST:event_jTextFieldDataMouseEntered

    private void jButtonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaidaActionPerformed
        // TODO add your handling code here:
        jPanelsaidas.setEnabled(true);
         jTextFieldData.setEnabled(false);
        JOptionPane.showMessageDialog(rootPane,"digite as saidas de hoje:");
        jTextFieldSaidaDinheiro.setEnabled(true);
        jTextFieldDepositoUbs.setEnabled(true);
        jTextFieldsaidCart.setEnabled(true);
        jTextFieldempresa.setEnabled(true);
       
    }//GEN-LAST:event_jButtonSaidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextFieldSaldoInicial.setText("");
        jTextFieldData.setText("");
        jTextFieldSaldoInicial.setEnabled(true);
        jButtonAbrirCaixa.setEnabled(true);
        jTextFieldData.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAbrirCaixa;
    private javax.swing.JButton jButtonFecharCaixa;
    private javax.swing.JButton jButtonSaida;
    private javax.swing.JButton jButtonSalvarSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotal1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelentrada;
    private javax.swing.JPanel jPanelsaidas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCartao;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDepositoUbs;
    private javax.swing.JTextField jTextFieldDinheiro;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldSaidaDinheiro;
    private javax.swing.JTextField jTextFieldSaidaUbs;
    private javax.swing.JTextField jTextFieldSaldoInicial;
    private javax.swing.JTextField jTextFieldValor1;
    private javax.swing.JTextField jTextFieldValor2;
    private javax.swing.JTextField jTextFieldValorTotal;
    private javax.swing.JTextField jTextFieldempresa;
    private javax.swing.JTextField jTextFieldsaidCart;
    // End of variables declaration//GEN-END:variables
}
