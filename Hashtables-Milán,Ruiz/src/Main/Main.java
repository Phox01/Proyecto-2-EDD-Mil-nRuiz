/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import GUI.WelcomeGUI;
import Classes.Hashtable;
import Classes.HashTableTitulos;
import Classes.NodoTitulos;
import Classes.ListaTitulos;
import Classes.ListaPalabrasClave;
/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable hashtable= new Hashtable();
        HashTableTitulos hashtable2=new HashTableTitulos();
        
         ListaPalabrasClave listaPalabrasClave= new ListaPalabrasClave();
        WelcomeGUI window= new WelcomeGUI(hashtable,hashtable2,listaPalabrasClave);
        
        window.setVisible(true);
        
        
        
       
        
        
        
    }
    
}
