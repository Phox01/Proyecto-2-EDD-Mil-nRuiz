/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.nio.file.Files;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class ArchivoTxt {

    public Object[] readTxt() {
        //Programa que convierte el txt en un objeto "Resumen"
        Object[] data = new Object[2];
        String title = "";
        String[] authors = new String[1];
        String body = "";
        String[] keywords = new String[1];
        String line = "";
        Resumen resumenText = new Resumen(title, authors, body, keywords);
        String resumenCompleto = "";
        JFileChooser archivo = new JFileChooser();
        archivo.showOpenDialog(null);
        File abre = archivo.getSelectedFile();
        data[0] = abre;
        data[1] = resumenText;

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
                data[1] = new Resumen(title, authors, body, keywords);

            }
            br.close();
            JOptionPane.showMessageDialog(null, "Lectura exitosa");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error, asegúrese de introducir un resumen con los sig. campos:\nTítulo\nAutores\nResumen\nPalabras clave");

        }

        return data;
    }

    public void copyTxt(File from, String name) {
        //Programa que convierte el txt en un objeto "Resumen" y copia su contenido en otro txt
        File dest = new File("SavedData/" +name+ ".txt");
        try {
            copyFile(from, dest);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "El archivo ya existe");

        }
    }

    public void copyFile(File from, File to) throws IOException {
        Files.copy(from.toPath(), to.toPath());
    }

}
