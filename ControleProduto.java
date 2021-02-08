/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloProduto;

/**
 *
 * @author bookafe
 */
public class ControleProduto {
    ModeloProduto mod = new ModeloProduto();
    ConectaBanco conexao = new ConectaBanco();
    ConectaBanco conexaoFornecedor = new ConectaBanco();
    int codFornecedor;
    String nomeFornecedor;
    
    public void inserirProduto(ModeloProduto mod){
        
        buscaCodigo(mod.getFornecedorProduto());
        conexao.conexao();
        
        try {
            PreparedStatement pst =  conexao.conn.prepareStatement("insert into produto(nome_produto,preco_venda,preco_compra,quantidade,id_fornecedor,tipo)"
                    + "values(?,?,?,?,?,?)");
            pst.setString(1,mod.getNomeProduto());
            pst.setFloat(2,mod.getPrecoVenda());
            pst.setFloat(3,mod.getPrecoCompra());
            pst.setFloat(4,mod.getQtdProduto());
            pst.setInt(5, codFornecedor);
            pst.setString(6,mod.getCategoria());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Produto Cadastrado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o produto"+ex);
        }
        conexao.desconecta();
        
    }
    
    public void buscaCodigo(String nome ){
        conexao.conexao();
        conexao.executaSQL("select * from fornecedores where nome_fornecedor='"+nome+"'");
        try {
            conexao.rs.first();
            codFornecedor=conexao.rs.getInt("id_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o codigo o produto"+ex);
        }
        conexao.desconecta();
        
           
       } 
    public ModeloProduto buscaProduto(ModeloProduto modelo ){
        conexao.conexao();
        conexao.executaSQL("select * from produto where nome_produto like '%" +modelo.getPesquisa()+ "%'");
        try {
            conexao.rs.first();
            buscaNomeFornecedor(conexao.rs.getInt("id_fornecedor"));
            mod.setIdProduto(conexao.rs.getInt("id_produto"));
            mod.setNomeProduto(conexao.rs.getString("nome_produto"));
            mod.setPrecoCompra(conexao.rs.getFloat("preco_compra"));
            mod.setPrecoVenda(conexao.rs.getFloat("preco_venda"));
            mod.setQtdProduto(conexao.rs.getInt("quantidade"));
            mod.setFornecedorProduto(nomeFornecedor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o produto"+ex);
        }
        conexao.desconecta();
        return mod;
        
           
       }
    public void buscaNomeFornecedor(int cod){
        conexaoFornecedor.conexao();
        conexaoFornecedor.executaSQL("select * from fornecedores where id_fornecedor="+ cod +"");
        try {
            conexaoFornecedor.rs.first();
            nomeFornecedor=conexaoFornecedor.rs.getString("nome_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o codigo o produto"+ex);
        }
        conexaoFornecedor.desconecta();
        
    }
    public void ExcluirProduto(ModeloProduto mod){
        conexao.conexao();
        try {
           PreparedStatement pst = conexao.conn.prepareStatement("delete from produto where id_produto=?");
           pst.setInt(1,mod.getIdProduto());
           pst.execute();
           JOptionPane.showMessageDialog(null,"Produto excluido com suscesso!!");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir o produto"+ex);
        }
        
        
    }
    
    public void editarProduto(ModeloProduto mod){
        buscaCodigo(mod.getFornecedorProduto());
        conexao.conexao();
        
      try {
           PreparedStatement pst = conexao.conn.prepareStatement("update produto set nome_produto=?, preco_venda=?, preco_compra=?"
                   + ",quantidade=?, id_fornecedor=? where id_produto=?");
            pst.setString(1,mod.getNomeProduto());
            pst.setFloat(2,mod.getPrecoVenda());
            pst.setFloat(3,mod.getPrecoCompra());
            pst.setFloat(4,mod.getQtdProduto());
            pst.setInt(5, codFornecedor);
            pst.setInt(6, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto alterado com suscesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir Produto!"+ ex);
        }
        conexaoFornecedor.desconecta();
        
    }
    
}
