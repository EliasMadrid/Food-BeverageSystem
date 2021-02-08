/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloBairro;

/**
 *
 * @author bookafe
 */
public class ControleBairro {

    ConectaBanco conex = new ConectaBanco();
    ConectaBanco conexPesq= new ConectaBanco();
    int codCid;
    String cidade;
    
    public void Gravar(ModeloBairro mod){
        conex.conexao(); // Comando que permite conectar com o banco de dados
        try {
            conex.executaSQL("select * from cidade where nome_cidade='"+ mod.getCidade() +"'"); // Comando que permite acessar uma tabela do banco de dados
            conex.rs.first(); // Comando que permite acessar uma linha da tabela selecionada do banco de dados
            codCid = conex.rs.getInt("id_cidade"); // Comando que permite pegar um dado correspondente da linha selecionada do banco de dados
            
            PreparedStatement pst = conex.conn.prepareStatement("insert into bairro (nome_bairro,id_cidade) values(?,?)"); // Comando de modificação de um banco de dados
            pst.setString(1, mod.getNome());
            pst.setInt(2, codCid);
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados armazenados com suscesso");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erros na insercao." + ex);   
        }
        conex.desconecta();
                
     
    }
    
    public ModeloBairro Primeiro(){
         ModeloBairro mod = new ModeloBairro();
         conex.conexao();
         conexPesq.conexao();
         conex.executaSQL("select * from bairro");
         try {
             conex.rs.first();
             conexPesq.executaSQL("select * from cidade where id_cidade" + conex.rs.getInt("id_cidade"));
             conexPesq.rs.first();
             cidade = conexPesq.rs.getString("nome_cidade");
             mod.setCod(conex.rs.getInt("id_bairro"));
             mod.setNome(conex.rs.getString("nome_bairro"));
             mod.setCidade(cidade);
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
        }
         conex.desconecta();
         conexPesq.desconecta();
         return mod;
         
     } 
    
    public ModeloBairro Ant(){
         ModeloBairro mod = new ModeloBairro();
         conex.conexao();
         conexPesq.conexao();
         //conex.executaSQL("select * from bairro");
         try {
             conex.rs.previous();
             conexPesq.executaSQL("select * from cidade where id_cidade" + conex.rs.getInt("id_cidade"));
             conexPesq.rs.first();
             cidade = conexPesq.rs.getString("nome_cidade");
             mod.setCod(conex.rs.getInt("id_bairro"));
             mod.setNome(conex.rs.getString("nome_bairro"));
             mod.setCidade(cidade);
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao mostrar dados" + ex);  
            
        }
         //conex.desconecta();
         conexPesq.desconecta();
         return mod;
         
     } 
    
    public ModeloBairro Prox(){
         ModeloBairro mod = new ModeloBairro();
         conex.conexao();
         conexPesq.conexao();
         //conex.executaSQL("select * from bairro");
         try {
             conex.rs.next();
             conexPesq.executaSQL("select * from cidade where id_cidade" + conex.rs.getInt("id_cidade"));
             conexPesq.rs.first();
             cidade = conexPesq.rs.getString("nome_cidade");
             mod.setCod(conex.rs.getInt("id_bairro"));
             mod.setNome(conex.rs.getString("nome_bairro"));
             mod.setCidade(cidade);
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao mostrar dados" + ex);  
            
        }
         //conex.desconecta();
         conexPesq.desconecta();
         return mod;
         
     } 
    
    public ModeloBairro Ult(){
         ModeloBairro mod = new ModeloBairro();
         conex.conexao();
         conexPesq.conexao();
         conex.executaSQL("select * from bairro");
         try {
             conex.rs.last();
             conexPesq.executaSQL("select * from cidade where id_cidade" + conex.rs.getInt("id_cidade"));
             conexPesq.rs.first();
             cidade = conexPesq.rs.getString("nome_cidade");
             mod.setCod(conex.rs.getInt("id_bairro"));
             mod.setNome(conex.rs.getString("nome_bairro"));
             mod.setCidade(cidade);
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao mostrar dados" + ex);  
            
        }
         conex.desconecta();
         conexPesq.desconecta();
         return mod;
         
     } 
    
    public void ExcluirBairro(ModeloBairro mod){
        conex.conexao();
        try {
            
           PreparedStatement pst = conex.conn.prepareStatement("delete from bairro where id_bairro=?");
           pst.setInt(1, mod.getCod());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Dados excluidos com suscesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros na exclusao dos dados." + ex);  
            
        }
        conex.desconecta();
    }
    
    public void AlteraBairro(ModeloBairro mod){
        conex.conexao();
        conexPesq.conexao();
        try { 
            
        conexPesq.executaSQL("select * from cidade where nome_cidade=" + mod.getNome());
        conexPesq.rs.first();
        codCid = conex.rs.getInt("id_cidade");
        PreparedStatement pst = conex.conn.prepareStatement("update bairro set nome_bairro=?, id_cidade=? where id_bairro=?");
        pst.setString(1, mod.getNome());
        pst.setInt(2, codCid);
        pst.setInt(3, mod.getCod());
        pst.execute();
         JOptionPane.showMessageDialog(null, "Dados alterados com suscesso." );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao editar os dados." + ex);  
        }
        conex.conexao();
        conexPesq.conexao();
    }
    
}
