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
import modelo.ModeloBaixaParc;
/**
 *
 * @author bookafe
 */
public class ControleBaixaParcela {
    ConectaBanco conex = new ConectaBanco();
    public ModeloBaixaParc BuscaParcela(ModeloBaixaParc mod){
        conex.conexao();
        
        try {
            conex.executaSQL("select * from parcela_venda where id_parc_venda="+mod.getCodParc());
            conex.rs.first();
            mod.setCodParc(conex.rs.getInt("id_parc_venda"));
            mod.setCodVend(conex.rs.getInt("cod_venda"));
            mod.setDataVenc(conex.rs.getString("data"));
            mod.setValor(conex.rs.getFloat("valor_parce"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar as parcelas"+ex);
        }
        conex.desconecta();
        return mod;
        
        
    }
    public void BaixarParcela(ModeloBaixaParc mod){
        conex.conexao();
        conex.executaSQL("select * from parcela_venda where id_parc_venda="+mod.getCodParc()+" and estado='PG'");
        
        try {
            
           if(conex.rs.first()){
             JOptionPane.showMessageDialog(null,"Esta parcela estar paga");  
           } else{
                   
        try {
            PreparedStatement pst = conex.conn.prepareStatement("update parcela_venda set estado=? where id_parc_venda=?");
            pst.setString(1, "PG");
            pst.setInt(2, mod.getCodParc());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Parcela baixada com suscesso");
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao dar baixa na parcela" +ex);
        }
        
      conex.desconecta();
      }
      
   } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao dar baixa na parcela" +ex);
        }
   } 
}
