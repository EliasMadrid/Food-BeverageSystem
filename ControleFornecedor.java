/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloFornecedor;
import modelo.ModeloProduto;

/**
 *
 * @author bookafe
 */
public class ControleFornecedor {
    ModeloFornecedor mod = new ModeloFornecedor();
    ConectaBanco conn = new ConectaBanco();
    ConectaBanco ConexaoBairro = new ConectaBanco();
    ConectaBanco connAux = new ConectaBanco();
    int codBairro;
    
    public void Salvar(ModeloFornecedor mod){
        AchaBairro(mod.getBairro());
        conn.conexao();
        try {
            
            PreparedStatement pst = conn.conn.prepareStatement("insert into fornecedores(nome_fornecedor,endereco,id_bairro,cnpj_fornecedor) values (?,?,?,?)");
             pst.setString(1,mod.getNome());
             pst.setString(2,mod.getEndereco());
             pst.setInt(3, codBairro);
             pst.setString(4, mod.getCNPJ());
             pst.execute();
              JOptionPane.showMessageDialog(null," Dados inseridos com suscesso" );
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null," Erro na insercao dos dados" + ex);
            
        }
        conn.desconecta();
        
        
    }
    
    public void Excluir(ModeloFornecedor mod){
        conn.conexao();
        try {
            PreparedStatement pst =  conn.conn.prepareStatement("delete from fornecedores where id_fornecedor=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null," Dados excluidos  com suscesso!" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro na exclusao do fornecedor" + ex);
        }
        conn.desconecta();
    }
    public ModeloFornecedor Primeiro(){
        conn.conexao();
        
        try {
            conn.executaSQL("select * from fornecedores inner join bairro on fornecedores.id_bairro=bairro.id_bairro\n" 
+ "inner join cidade on bairro.id_cidade=cidade.id_cidade\n" 
+ "inner join estados on cidade.id_estado = estados.id_estado");
            conn.rs.first();
            mod.setId(conn.rs.getInt("id_fornecedor"));
            mod.setNome(conn.rs.getString("nome_fornecedor"));
            mod.setEndereco(conn.rs.getString("endereco"));
            mod.setCNPJ(conn.rs.getString("nome_bairro"));
            mod.setCidade(conn.rs.getString("nome_cidade"));
            mod.setSigla_estado(conn.rs.getString("sigla_estado"));
                     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao achar o primeiro" + ex);
        }
        
        
        return mod;
            
        }
    public ModeloFornecedor Ultimo(){
        conn.conexao();
        
        try {
            conn.executaSQL("select * from fornecedores inner join bairro on fornecedores.id_bairro=bairro.id_bairro\n" 
+ "inner join cidade on bairro.id_cidade=cidade.id_cidade\n" 
+ "inner join estados on cidade.id_estado = estados.id_estado");
            conn.rs.last();
            mod.setId(conn.rs.getInt("id_fornecedor"));
            mod.setNome(conn.rs.getString("nome_fornecedor"));
            mod.setEndereco(conn.rs.getString("endereco"));
            mod.setCNPJ(conn.rs.getString("nome_bairro"));
            mod.setCidade(conn.rs.getString("nome_cidade"));
            mod.setSigla_estado(conn.rs.getString("sigla_estado"));
                     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao achar o primeiro" + ex);
        }
        
        
        return mod;
            
        }
    
    public ModeloFornecedor Anterior(){
        
        
        try {
         
            conn.rs.previous();
            mod.setId(conn.rs.getInt("id_fornecedor"));
            mod.setNome(conn.rs.getString("nome_fornecedor"));
            mod.setEndereco(conn.rs.getString("endereco"));
            mod.setCNPJ(conn.rs.getString("nome_bairro"));
            mod.setCidade(conn.rs.getString("nome_cidade"));
            mod.setSigla_estado(conn.rs.getString("sigla_estado"));
                     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao achar o primeiro" + ex);
        }
        
        
        return mod;
            
        }
    
    public ModeloFornecedor proximo(){
        //conn.conexao();
        
        try {
       
            conn.rs.next();
            mod.setId(conn.rs.getInt("id_fornecedor"));
            mod.setNome(conn.rs.getString("nome_fornecedor"));
            mod.setEndereco(conn.rs.getString("endereco"));
            mod.setCNPJ(conn.rs.getString("nome_bairro"));
            mod.setCidade(conn.rs.getString("nome_cidade"));
            mod.setSigla_estado(conn.rs.getString("sigla_estado"));
                     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao achar o proximo" + ex);
        }
        
        //conn.desconecta();
        return mod;
            
        }
    
    public void AchaBairro(String bairro){
        conn.conexao();
        
        try {
            conn.executaSQL("select * from bairro where nome_bairro = '"+bairro+"'");
            conn.rs.first();
            codBairro = conn.rs.getInt("id_bairro");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null," Erro na insercao dos dados" + ex);
        }
          conn.desconecta();
        }
    
    
    public void editar(ModeloFornecedor mod){
        AchaBairro(mod.getBairro());
        conn.conexao();
        
      try {
           PreparedStatement pst = conn.conn.prepareStatement("update fornecedores set nome_fornecedor=?, endereco=?, cnpj_fornecedor=?"
                   + ", id_bairro=? where id_fornecedor=?");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEndereco());
            pst.setString(3,mod.getCNPJ());
            pst.setInt(4,codBairro);
            pst.setInt(5, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"nome fornecedor alterado com suscesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir fornecedor!"+ ex);
        }
        ConexaoBairro.desconecta();
        
    }
    
}
