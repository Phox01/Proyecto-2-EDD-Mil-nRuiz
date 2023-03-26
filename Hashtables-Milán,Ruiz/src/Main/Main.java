/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import GUI.WelcomeGUI;
import Classes.Hashtable;
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
        WelcomeGUI window= new WelcomeGUI(hashtable);
        window.setVisible(true);
    }
    
}
