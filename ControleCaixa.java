/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCaixa;
/**
 *
 * @author bookafe
 */
/*public class ControleCaixa {
 ModeloCaixa mod = new ModeloCaixa();
    ConectaBanco conexao = new ConectaBanco();
    //ConectaBanco conexaoCaixa = new ConectaBanco();
    //int codFornecedor;
    //String nomeFornecedor;
    
   public void inserirProduto(ModeloCaixa mod){
        
      
        conexao.conexao();
        
        try {
            PreparedStatement pst =  conexao.conn.prepareStatement("insert into caixa(cartao,dinheiro,total_regist,data,saldo_inicial,"
                    + "entrada,saida,deposito_ubs,saldo_cofre,status_saldo,valor_saldo,saidas_especies2,comprovante_cartao,manipuladores do caixa,media_vendas)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNomeProduto());
            pst.setFloat(2,mod.getPrecoVenda());
            pst.setFloat(3,mod.getPrecoCompra());
            pst.setFloat(4,mod.getQtdProduto());
            pst.setInt(5, codFornecedor);
            pst.execute();
             JOptionPane.showMessageDialog(null,"Produto Cadastrado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o produto"+ex);
        }
        conexao.desconecta();
       
     }   
}*/
