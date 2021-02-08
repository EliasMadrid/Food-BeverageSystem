/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCidade;

public class ControleCidade {
    ConectaBanco conCidade = new ConectaBanco();
    
    public void InserirCidade(ModeloCidade mod){
        conCidade.conexao();
        try {
            PreparedStatement pst = conCidade.conn.prepareStatement("insert into cidade(nome_cidade,id_estado) values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados armazenados com suscesso");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erros na insercao." + ex);   
        }
        conCidade.desconecta();
                
        
    }
    public void ExcluirCidade(ModeloCidade mod){
        conCidade.conexao();
        try {
            
           PreparedStatement pst = conCidade.conn.prepareStatement("delete from cidade where id_cidade=?");
           pst.setInt(1, mod.getCod());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Dados excluidos com suscesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erros na exclusao dos dados." + ex);  
            
        }
        conCidade.desconecta();
    }
    public void AlteraCidade(ModeloCidade mod){
        conCidade.conexao();
        try {  
            PreparedStatement pst = conCidade.conn.prepareStatement("update cidade set nome_cidade=?, id_estado=? where id_cidade=?");
        pst.setString(1, mod.getNome());
        pst.setInt(2, mod.getCod_estado());
        pst.setInt(3, mod.getCod());
        pst.execute();
         JOptionPane.showMessageDialog(null, "dados alterados com suscesso." );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erros na alteracao dos dados." + ex);  
        }
    }
    
}
