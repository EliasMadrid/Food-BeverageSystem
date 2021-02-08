/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloTelefone;


public class ControleTelefone {
    
    ConectaBanco conex = new ConectaBanco();
    ModeloTelefone mod = new ModeloTelefone();
    
    public void Inserir(ModeloTelefone mod){
        conex.conexao();
        try {
         
            
            PreparedStatement pst = conex.conn.prepareStatement("insert into telefone (numero_tel) values(?)");
            pst.setString(1, mod.getTel());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inseridos com suscesso");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erros na insercao." + ex);   
        }
        conex.desconecta();
                
     
    }
    
    public ModeloTelefone Primeiro(){
         
         conex.conexao();
     
         conex.executaSQL("select * from telefone");
         try {
             conex.rs.first();
             mod.setCod(conex.rs.getInt("id_telefone"));
             mod.setTel(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
        }
         conex.desconecta();
         return mod;
         
     } 
    
    public ModeloTelefone anterior(){
         conex.conexao();
     
         conex.executaSQL("select * from telefone");
         try {
             conex.rs.previous();
             mod.setCod(conex.rs.getInt("id_telefone"));
             mod.setTel(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
        }
         conex.desconecta();
         return mod;
         
     } 
    
    public ModeloTelefone proximo(){
          conex.conexao();
     
         conex.executaSQL("select * from telefone");
         try {
             conex.rs.next();
             mod.setCod(conex.rs.getInt("id_telefone"));
             mod.setTel(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
        }
         conex.desconecta();
         return mod;
         
     } 
    
    public ModeloTelefone ultimo(){
          conex.conexao();
     
         conex.executaSQL("select * from telefone");
         try {
             conex.rs.last();
             mod.setCod(conex.rs.getInt("id_telefone"));
             mod.setTel(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros ao mostrar dados" + ex);  
            
        }
         conex.desconecta();
         return mod;
        
        
         
     } 
    
    public void Excluir(ModeloTelefone mod){
        conex.conexao();
        PreparedStatement pst;
        try {
            
           pst = conex.conn.prepareStatement("delete from telefone where id_telefone=?");
           pst.setInt(1, mod.getCod());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Dados excluidos com suscesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros na exclusao dos dados." + ex);  
            
        }
        conex.desconecta();
    }
    
    public void alterar(ModeloTelefone mod){
        conex.conexao();
       PreparedStatement pst;
        try { 
            
       
        pst = conex.conn.prepareStatement("update telefone set numero_tel=? where id_telefone=?");
        pst.setString(1, mod.getTel());
        pst.setInt(2, mod.getCod()); 
        pst.execute();
         JOptionPane.showMessageDialog(null, "Dados alterados com suscesso." );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao editar os dados." + ex);  
        }
        conex.conexao();
      
    }
    
}
