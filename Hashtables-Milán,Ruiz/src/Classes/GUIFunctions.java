/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import javax.swing.JOptionPane;
import Classes.Hashtable;
import Classes.HashTableTitulos;
import Classes.ListaTitulos;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class GUIFunctions {

   public void avisoEmpty(boolean value, Resumen resumen,Hashtable hashtable, File file,HashTableTitulos hashtable2,ListaPalabrasClave listapalabarasclave) {
        if (value == true) {
            JOptionPane.showMessageDialog(null, "Oooops, el error se pudo deber a:\nEl resumen tiene algún campo vacío \nEl resumen no tiene el formato correspondiente");
        } else {
            JOptionPane.showMessageDialog(null, "El resumen fue introducido con éxito");
            introduceInHashtable(resumen, hashtable);
            introducePalabrasClaves( resumen,  hashtable2);
            ArchivoTxt archivo= new ArchivoTxt();
            archivo.copyTxt(file, resumen.getTitle());
            
            
            InsertarLista( listapalabarasclave, resumen);
            
            
        }
    }
    public void introduceInHashtable(Resumen resumen, Hashtable hashtable){
        
        
        
        
         int numero=hashtable.NumeroHashtable(resumen.getTitle());
        hashtable.getArray()[numero]= resumen;


    }
    
    public void introducePalabrasClaves(Resumen resumen, HashTableTitulos hashtable2){
       
        for (int i = 0; i < resumen.getKeywords().length; i++) {
            
            int numero=hashtable2.NumeroHashtableTitulo(resumen.getKeywords()[i]);
            String titulo = resumen.getTitle();
            
            
            if (hashtable2.getArray()[numero]==null){
                System.out.println("hola");
            ListaTitulos listat= new ListaTitulos();
            hashtable2.getArray()[numero]= listat;
         
            hashtable2.getArray()[numero].InsertarPrimero(titulo);
            }else{
                System.out.println("hola2");
                hashtable2.getArray()[numero].InsertarPrimero(titulo);
            }
            
        }
        
    }
    
    
    public void InsertarLista(ListaPalabrasClave listapalabarasclave,Resumen resumen){
        
        for (int i = 0; i < resumen.getKeywords().length; i++) {
            
            
            
            
            
            listapalabarasclave.InsertarPrimero(resumen.getKeywords()[i]);
            
            
            
        }
   
    }

}
