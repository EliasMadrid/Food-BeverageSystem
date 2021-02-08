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

/**
 *
 * @author bookafe
 */
public class ControleDataVenc {
    ConectaBanco conn = new ConectaBanco();
    public void salvarData(String data){
        conn.conexao();
        
        try {
            PreparedStatement pst = conn.conn.prepareStatement("insert into vencimento(datavencimento) values(?)");
            pst.setString(1, data);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data cadastrada com suscesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na insercao da data"+ ex);
        }
       
        
    }
    
}
