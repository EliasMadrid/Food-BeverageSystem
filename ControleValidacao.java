/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bookafe
 */
public class ControleValidacao {
    
    ConectaBanco conn = new ConectaBanco();
    int valida;
    public void valida(String senha){
        conn.conexao();
        conn.executaSQL("select * from vencimento ");
        try {
            conn.rs.last();
            valida = Integer.parseInt(conn.rs.getString("datavencimento"));
            int operacao = (valida+ 132)/4;
            int senhaValidacao = Integer.parseInt(senha);
            if(operacao==senhaValidacao){
                int dia,mes,ano;
                String AcertaMes,AcertaDia, ProximaSenha;
               
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
                Date hoje = new Date();
                String data = df.format(hoje);
                char[] senhachar = data.toCharArray();
                
                dia = Integer.parseInt(""+senhachar[0]+senhachar[1]);
                mes = Integer.parseInt(""+senhachar[3]+senhachar[4]);
                ano = Integer.parseInt(""+senhachar[6]+senhachar[7]+senhachar[8]+senhachar[9]);
               
                if(mes<12){
                    
                    mes++;
                    
                    if(mes<10){
                        
                      AcertaMes="0"+mes;  
                    }
                  else {
                        AcertaMes =""+mes;
                    } 
                    
                }else{
                    mes=1;
                    ano++;
                    AcertaMes ="0"+mes;
                }
                if(dia<10){
                    AcertaDia="0"+dia;
                }
                else{
                   AcertaDia=""+dia;  
                }
                ProximaSenha = AcertaDia +AcertaMes+ano;
                PreparedStatement pst = conn.conn.prepareStatement("insert into vencimento(datavencimento)values(?)");
                pst.setString(1,ProximaSenha);
                pst.execute();
             //JOptionPane.showMessageDialog(null,""+ProximaSenha);   
            }else{
              JOptionPane.showMessageDialog(null,"Senha errada");   
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao validar" +ex);
        }
        conn.desconecta();
        
        
    }
}
