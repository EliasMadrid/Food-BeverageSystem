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
import modelo.ModeloLogin;

/**
 *
 * @author bookafe
 */
public class ControleLogin {
    
    ConectaBanco conex = new ConectaBanco();
    ModeloLogin modelo = new ModeloLogin();
    
    public void salvar(ModeloLogin mod){
        conex.conexao();
        try {
            
            PreparedStatement pst = conex.conn.prepareStatement("insert into login (nome,senha,permissao,login)values(?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPermissao());
            pst.setString(4, mod.getLogin());
            pst.execute();
            JOptionPane.showMessageDialog(null, "usuario cadastrado com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o usuario"+ex);
        }
        conex.desconecta();
    }
    public void excluir(ModeloLogin mod){
      conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("delete from login where id_login = ?");
            pst.setInt(1,mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "usuario excluido com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir usuario o usuario"+ex);
        }
        conex.desconecta();
    }
    public ModeloLogin primeiro(){
        conex.conexao();
        
        try {
            conex.executaSQL("select * from login");
            conex.rs.first();
            modelo.setId(conex.rs.getInt("id_login"));
            modelo.setLogin(conex.rs.getString("login"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setPermissao(conex.rs.getString("permissao"));
            modelo.setSenha(conex.rs.getString("senha"));
           
            //JOptionPane.showMessageDialog(null, "usuario cadastrado com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o usuario"+ex);
        }
        conex.desconecta();
        return modelo;
        
        
    }
   
    
    
    public ModeloLogin ultimo(){
        //conex.conexao();
        
        try {
            //conex.executaSQL("select * from login");
            conex.rs.last();
            modelo.setId(conex.rs.getInt("id_login"));
            modelo.setLogin(conex.rs.getString("login"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setPermissao(conex.rs.getString("permissao"));
            modelo.setSenha(conex.rs.getString("senha"));
           
            //JOptionPane.showMessageDialog(null, "usuario cadastrado com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o usuario"+ex);
        }
        conex.desconecta();
        return modelo;
        
        
    }
     public ModeloLogin anterior(){
        //conex.conexao();
        
        try {
            //conex.executaSQL("select * from login");
            conex.rs.previous();
            modelo.setId(conex.rs.getInt("id_login"));
            modelo.setLogin(conex.rs.getString("login"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setPermissao(conex.rs.getString("permissao"));
            modelo.setSenha(conex.rs.getString("senha"));
           
            //JOptionPane.showMessageDialog(null, "usuario cadastrado com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o usuario"+ex);
        }
        conex.desconecta();
        return modelo;
        
        
    }
    public ModeloLogin proximo(){
        //conex.conexao();
        
        try {
            //conex.executaSQL("select * from login");
            conex.rs.next();
            modelo.setId(conex.rs.getInt("id_login"));
            modelo.setLogin(conex.rs.getString("login"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setPermissao(conex.rs.getString("permissao"));
            modelo.setSenha(conex.rs.getString("senha"));
           
            //JOptionPane.showMessageDialog(null, "usuario cadastrado com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o usuario"+ex);
        }
        conex.desconecta();
        return modelo;
        
        
    }
    
    public void alterar(ModeloLogin mod){
        conex.conexao();
        
        
        try {
           PreparedStatement pst = conex.conn.prepareStatement("update login set nome=?,senha=?,permissao=?,login=? where id_login=?");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPermissao());
            pst.setString(4, mod.getLogin());
            pst.setInt(5, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "usuario alterado com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o usuario"+ex);
        }
        conex.desconecta();
       
       
        
        
    }
    
    
    
        
        
    }
    

