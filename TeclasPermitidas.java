
package teclasPermitidas;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class TeclasPermitidas extends PlainDocument {
    @Override
   /* public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ |^0-9|^,]", ""), attr);
        
    }
     public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ |^0-9|^,]", ""), attr);
        
    }*/
     // apenas letras maiusculas 
    /*
     public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^a-z|^A-Z]", ""), attr);
        
    }
     public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^a-z|^A-Z]", ""), attr);
        
    }*/
     
      public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^0-9|^.]", ""), attr);
        
    }
     public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        
      super.insertString(offset, str.toUpperCase().replaceAll("[^0-9|^.]", ""), attr);  
        
        
    }
}
