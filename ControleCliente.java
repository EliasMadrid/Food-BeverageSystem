/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCliente;


/**
 *
 * @author bookafe
 */
public class ControleCliente {
    ConectaBanco conex = new ConectaBanco();
    ModeloCliente modCli = new ModeloCliente();
    int codBairro, codCidade, codTel;
    String Bairro, Cidade, Telefone;
    
    
    public void Inserir(ModeloCliente mod){
        
        conex.conexao();
        buscaCod (mod.getBairro(), mod.getCidade(), mod.getTelefone());
        
        
        try {
         
            
            PreparedStatement pst = conex.conn.prepareStatement("insert into clientes (nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro) values (?,?,?,?,?)"); 
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            buscaCod (mod.getBairro(), mod.getCidade(), mod.getTelefone());
            pst.setInt(5, codBairro);
            
            pst.execute();
            
            conex.executaSQL("select * from telefone where numero_tel='" +mod.getTelefone()+ "'");
            conex.rs.first();
            codTel=conex.rs.getInt("id_telefone");
            
            
            conex.executaSQL("select * from clientes where nome_cliente='" +mod.getNome()+ "'");
            conex.rs.first();
            int codCli = conex.rs.getInt("id_cliente");
            pst = conex.conn.prepareStatement("insert into itens_cli_tel(id_cliente, id_tel) values(?,?)");
            buscaCod(mod.getBairro(), mod.getCidade(),"");
            pst.setInt(1, codCli);
            pst.setInt(2, codTel);
            pst.execute();
           
             JOptionPane.showMessageDialog(null, "Dados inseridos com suscesso");
        } catch (SQLException ex) {
          //JOptionPane.showMessageDialog(null, "Erros na insercao." + ex);   
        }
        conex.desconecta();
                
     
    }
    
    public ModeloCliente Primeiro(){
         
         conex.conexao();
     
        
         try {
            conex.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente\n" +
"                       inner join telefone on itens_cli_tel.id_tel=telefone.id_telefone\n" +
"                       inner join bairro on clientes.id_bairro=bairro.id_bairro inner join cidade on bairro.id_cidade=cidade.id_cidade");
             conex.rs.first();
             modCli.setId(conex.rs.getInt("id_cliente"));
             modCli.setNome(conex.rs.getString("nome_cliente"));
             modCli.setEndereco(conex.rs.getString("endereco_cliente"));
             modCli.setRg(conex.rs.getString("rg_cliente"));
             modCli.setCpf(conex.rs.getString("cpf_cliente"));
             modCli.setBairro(conex.rs.getString("nome_bairro"));
             modCli.setCidade(conex.rs.getString("nome_cidade"));
             modCli.setTelefone(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao selecionar a primeira opção" + ex);  
            
        }
         conex.desconecta();
         return modCli;
         
     } 
    
    public ModeloCliente anterior(){
         conex.conexao();
     
        
         try {
            conex.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente\n" +
"                       inner join telefone on itens_cli_tel.id_tel=telefone.id_telefone\n" +
"                       inner join bairro on clientes.id_bairro=bairro.id_bairro inner join cidade on bairro.id_cidade=cidade.id_cidade");
             conex.rs.previous();
             modCli.setId(conex.rs.getInt("id_cliente"));
             modCli.setNome(conex.rs.getString("nome_cliente"));
             modCli.setEndereco(conex.rs.getString("endereco_cliente"));
             modCli.setRg(conex.rs.getString("rg_cliente"));
             modCli.setCpf(conex.rs.getString("cpf_cliente"));
             modCli.setBairro(conex.rs.getString("nome_bairro"));
             modCli.setCidade(conex.rs.getString("nome_cidade"));
             modCli.setTelefone(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao selecionar a primeira opção" + ex);  
            
        }
       
         return modCli;
         
         
     } 
    
    public ModeloCliente proximo(){
          conex.conexao();
     
        
         try {
            conex.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente\n" +
                       "inner join telefone on itens_cli_tel.id_tel=telefone.id_telefone\n" +
                       "inner join bairro on clientes.id_bairro=bairro.id_bairro inner join cidade on bairro.id_cidade=cidade.id_cidade");
            
            conex.rs.next();
             modCli.setId(conex.rs.getInt("id_cliente"));
             modCli.setNome(conex.rs.getString("nome_cliente"));
             modCli.setEndereco(conex.rs.getString("endereco_cliente"));
             modCli.setRg(conex.rs.getString("rg_cliente"));
             modCli.setCpf(conex.rs.getString("cpf_cliente"));
             modCli.setBairro(conex.rs.getString("nome_bairro"));
             modCli.setCidade(conex.rs.getString("nome_cidade"));
             modCli.setTelefone(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao selecionar a primeira opção" + ex);  
            
        }
         conex.desconecta();
         return modCli;
         
         
     } 
    
    public ModeloCliente ultimo(){
          conex.conexao();
     
        
         try {
            conex.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente\n" +
"                       inner join telefone on itens_cli_tel.id_tel=telefone.id_telefone\n" +
"                       inner join bairro on clientes.id_bairro=bairro.id_bairro inner join cidade on bairro.id_cidade=cidade.id_cidade");
             conex.rs.last();
             modCli.setId(conex.rs.getInt("id_cliente"));
             modCli.setNome(conex.rs.getString("nome_cliente"));
             modCli.setEndereco(conex.rs.getString("endereco_cliente"));
             modCli.setRg(conex.rs.getString("rg_cliente"));
             modCli.setCpf(conex.rs.getString("cpf_cliente"));
             modCli.setBairro(conex.rs.getString("nome_bairro"));
             modCli.setCidade(conex.rs.getString("nome_cidade"));
             modCli.setTelefone(conex.rs.getString("numero_tel"));
             
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao selecionar a primeira opção" + ex);  
            
        }
         conex.desconecta();
         return modCli;
         
     } 
    
    public void Excluir(ModeloCliente mod){
        conex.conexao();
        
        try {
            
           PreparedStatement pst = conex.conn.prepareStatement("delete from itens_cli_tel where id_cliente=?");
           pst.setInt(1, mod.getId());
           pst.execute();
           
           pst = conex.conn.prepareStatement("delete from clientes where id_cliente=?");
           pst.setInt(1, mod.getId());
           pst.execute();
           
           JOptionPane.showMessageDialog(null, " Exclusão realizada com suscesso!!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros na exclusao dos dados." + ex);  
            
        }
        conex.desconecta();
    }
    
    public void alterar(ModeloCliente mod){
        conex.conexao();
       
        try { 
            
        conex.executaSQL("select * from telefone where numero_tel ='"+mod.getTelefone()+"'");
        conex.rs.first();
        codTel=conex.rs.getInt("id_telefone");
        PreparedStatement pst = conex.conn.prepareStatement("update telefone set numero_tel=? where id_telefone=?");
        pst.setInt(1,codTel);
        pst.setInt(2,mod.getId());
        pst.execute();
        pst = conex.conn.prepareStatement("update clientes set nome_cliente=?,endereco_cliente=?, rg_cliente=?, cpf_cliente=?, id_bairro=? where id_cliente=?");
        
         pst.setString(1, mod.getNome());
         pst.setString(2, mod.getEndereco());
         pst.setString(3, mod.getRg());
         pst.setString(4, mod.getCpf());
         buscaCod (mod.getBairro(), mod.getCidade(),"");
         pst.setInt(5, codBairro);
         pst.setInt(6, mod.getId());   
         pst.execute();
         JOptionPane.showMessageDialog(null, " Alteração realizada com suscesso." );
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao editar os dados." + ex);  
        }
        conex.desconecta();
      
    }
    
    public void buscaCod(String Bairro, String Cidade, String tel){
        
        try { 
           conex.executaSQL("select * from bairro where nome_bairro='"+ Bairro +"'");
           conex.rs.first();
           codBairro = conex.rs.getInt("id_bairro");
           
           conex.executaSQL("select * from cidade where nome_cidades='"+ Cidade +"'");
           conex.rs.first();
           codCidade = conex.rs.getInt("id_cidade");
           
           conex.executaSQL("select * from telefone where numero_tel='"+ tel +"'");
           conex.rs.first();
           codTel = conex.rs.getInt("id_telefone");
       
       
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erros ao editar os dados." + ex);  
        }
        
    }
    
    public void buscaNomes(int codBairro, int codCid){
        
        try { 
           conex.executaSQL("select * from bairro where id_bairro='"+ codBairro +"'");
           conex.rs.first();
           Bairro = conex.rs.getString("nome_bairro");
           
           conex.executaSQL("select * from cidade where id_cidade='"+ codCid +"'");
           conex.rs.first();
           Cidade = conex.rs.getString("nome_cidade");
           
           
       
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os Nomes." + ex);  
        }
        
    }
    
    
}
