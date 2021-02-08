/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author bookafe
 */
public class AtualizadorHora {
    
    public static  void start(final JLabel labelHorario){
        Thread atualizahora = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while(true){
                        Date date = new Date();
                        StringBuffer data = new StringBuffer();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        labelHorario.setText(data.toString()+sdf.format(date));
                        Thread.sleep(1000);
                        labelHorario.revalidate();
                        
                    }
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
           
        }
               
            }
        });
        atualizahora.start();
    }
    
}
