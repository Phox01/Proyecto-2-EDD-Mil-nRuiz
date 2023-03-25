/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class ArchivoTxt {

    public Resumen leerTxt() {
        //Programa que convierte el txt en un objeto "Resumen"
        String title = "";
        String [] authors= new String[0];
        String body = "";
        String[] keywords= new String[0];
        String line = "";
        Resumen resumenText = new Resumen(title, authors, body, keywords);
        String resumenCompleto = "";
        JFileChooser archivo = new JFileChooser();
        archivo.showOpenDialog(null);
        File abre = archivo.getSelectedFile();

        try {

            FileReader fr = new FileReader(abre);
            BufferedReader br = new BufferedReader(fr);
            while (!(line = br.readLine()).equals("Autores")) {
                if (!line.isEmpty()) {
                    resumenCompleto += line;
                }
            }
            resumenCompleto += "Autores";
            while (!(line = br.readLine()).equals("Resumen")) {
                if (!line.isEmpty()) {
                    resumenCompleto += line + "\n";
                }
            }
            resumenCompleto += "Resumen";
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    resumenCompleto += line;
                }
            }

            if (!"".equals(resumenCompleto)) {
                String[] resumenSplit = resumenCompleto.split("Autores");
                title = resumenSplit[0];
                String[] authors_body = resumenSplit[1].split("Resumen");
                authors = authors_body[0].split("\n");
                String[] body_keywords = authors_body[1].split("Palabras claves: ");
                body = body_keywords[0];
                keywords = body_keywords[1].split(", ");
                resumenText = new Resumen(title, authors, body, keywords);

            }
            br.close();
            JOptionPane.showMessageDialog(null, "lectura exitosa");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");

        }
        return resumenText;
    }

}
