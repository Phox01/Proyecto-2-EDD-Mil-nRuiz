/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import javax.swing.JOptionPane;
 import Classes.Hashtable;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class GUIFunctions {

    public void avisoEmpty(boolean value, Resumen resumen,Object[] hashtable, File file) {
        if (value == true) {
            JOptionPane.showMessageDialog(null, "Oooops, el error se pudo deber a:\nEl resumen tiene algún campo vacío \nEl resumen no tiene el formato correspondiente");
        } else {
            JOptionPane.showMessageDialog(null, "El resumen fue introducido con éxito");
            introduceInHashtable(resumen, hashtable);
            ArchivoTxt archivo= new ArchivoTxt();
            archivo.copyTxt(file, resumen.getTitle());
            
        }
    }
    public void introduceInHashtable(Resumen resumen, Object [] hashtable){
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i]==null){
                hashtable[i]=resumen;
            }
        }
    }

}
