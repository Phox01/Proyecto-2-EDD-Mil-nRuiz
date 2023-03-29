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
import Classes.ListaAutores;
import Classes.HashTableTitulosAutores;
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
        HashTableTitulosAutores hashtable3=new HashTableTitulosAutores();
        
         ListaPalabrasClave listaPalabrasClave= new ListaPalabrasClave();
         ListaAutores listaAutores= new ListaAutores();
         
        WelcomeGUI window= new WelcomeGUI(hashtable,hashtable2,listaPalabrasClave,listaAutores,hashtable3);
        
        
        window.setVisible(true);
        
        
        
       
        
        
        
    }
    
}
