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

    public Object[] introduce(boolean value, Resumen resumen, Hashtable hashtable, File file, File[] arrayFiles, Resumen[] resumenes) {
        Object[] arrayResumenesYFiles = new Object[3];

        if (value == true) {
            JOptionPane.showMessageDialog(null, "Oooops, el error se pudo deber a:\nEl resumen tiene algún campo vacío \nEl resumen no tiene el formato correspondiente");

        } else {
//            File[] newArrayFiles = arrayFiles;
//            Resumen[] newResumenes = resumenes;
            value = introduceInHashtable(resumen, hashtable);
            if (value != false) {
                arrayFiles = (File[]) insertInArray(file, arrayFiles);
                resumenes = (Resumen[]) insertInArray(resumen, resumenes);
                arrayResumenesYFiles[2]=value;
                JOptionPane.showMessageDialog(null, "El resumen fue introducido con éxito");
            }else{
                arrayResumenesYFiles[2]=value;
            }

        }
        arrayResumenesYFiles[0] = arrayFiles;
        arrayResumenesYFiles[1] = resumenes;
        return arrayResumenesYFiles;
    }

    public Object[] insertInArray(Object data, Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                JOptionPane.showMessageDialog(null, "El resumen que intenta introducir se encuentra ya introducido");
                return array;

            }else if (array[i] == null) {
                array[i] = data;
            } else if (i == array.length - 1) {
                array = agrandarArrayList(array, data);
                return array;

            }
        }
        return array;
    }

    public boolean introduceInHashtable(Resumen resumen, Hashtable hashtable) {
        System.out.println(resumen.getTitle());
        int numero = hashtable.NumeroHashtable(resumen.getTitle());
        if (hashtable.getArray()[numero] != null && resumen != hashtable.getArray()[numero]) {
            JOptionPane.showMessageDialog(null, "El resumen que intenta introducir se encuentra ya introducido");
            return false;
        } else {
            hashtable.getArray()[numero] = resumen;
            return true;
        }
    }

    public void saveData(File[] arrayFiles, Resumen[] resumenes) {
        ArchivoTxt archivo = new ArchivoTxt();
        for (int i = 0; i < arrayFiles.length; i++) {
            archivo.copyTxt(arrayFiles[i], resumenes[i].getTitle());
        }
    }

    public Object[] agrandarArrayList(Object[] array, Object data) {
        Object[] newFiles = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newFiles[i] = array[i];
        }
        newFiles[newFiles.length - 1] = data;
        return newFiles;
    }

}
