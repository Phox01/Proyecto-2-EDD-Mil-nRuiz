/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author leste
 */
public class Functions {
    
    public String readText(String path) {
        String line;
        String Text = "";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        Text += line + "\n";
                    }
                }
                br.close();
                return Text;
            }
        } catch (Exception ex){
            return "";
        } 
        return Text;
    }
    
    public infoObject createObjects(String Text){  
        
        //Crea los objetos que compone el resumen entero 
        
        infoObject info = new infoObject();
        String title = "";
        String autor = "";
        String summary = "";
        String keyword = "";
        int aux = 0;
        if (!"".equals(Text)){   
            String[] textLineSplit = Text.split("\n");           
            for (int i = 0; i < textLineSplit.length; i++) {
                if (textLineSplit[i].equals("Autores")) {
                    break;
                }   
                aux += 1;
                title += " "+textLineSplit[i];  // se crea el titulo
            }
            title = title.replace("\n", " ").trim();
            
            for (int i = aux + 1; i < textLineSplit.length; i++) { 
                if (textLineSplit[i].equals("Resumen")) {
                    break;
                }  
                aux += 1;
                autor += textLineSplit[i].replace("-", " ") + ",";   // se crean los autores string                      
               } 
 
            for (int i = aux + 1 ; i < textLineSplit.length; i++) { // pendiente con el +1 del aux
                if (textLineSplit[i].contains("Palabras claves:") || textLineSplit[i].contains("Palabras Claves:")) {
                    break;
                }  
                aux += 1;
                summary += " "+textLineSplit[i];     //  se crea el resumen               
               }
            summary = summary.replace("Resumen", "").trim();
            
            
            for (int i = aux + 1; i < textLineSplit.length; i++){ 
                keyword += textLineSplit[i];
                }
            }
            if (keyword.contains("Palabras claves:") || keyword.contains("Palabras Claves:")) {
                    keyword = keyword.replace("Palabras claves: ", "").replace("y", ",").replace(".", "").replace(", ", ",");
                    keyword = keyword.replace("Palabras Claves: ", "").replace("y", ",").replace(".", "").replace(", ", ",");
                }  
            String[] keywords = keyword.split(","); // se crean palabras claves string[]
           
               
        String[] autores = autor.split(",");
        info.setTitle(title);
        info.setAutores(autores);
        info.setSummary(summary);
        info.setKeywords(keywords);
        
        return info;
    }
    
    public void writeText(String summary){
        try {
            String path = "test\\total.txt";
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("test\\total.txt"), true ));
            pw.append("\n" + summary);
            pw.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }      
    }
    
    public int countWords(String summary, String palabra){
        int contador = 0;
        summary = summary.toLowerCase();
        palabra = palabra.toLowerCase();

        while (summary.contains(palabra)) {
            summary = summary.substring(summary.indexOf(
            palabra) + palabra.length(), summary.length());
            contador++;
        }
        return contador;
    }

    public void addToKeywordTable(String[] keywords, String title) {
        HashTable2 table = GlobalVariables.getKeywordTable();
        for (int i = 0; i < keywords.length; i++) {
            KeyWordObject temp = new KeyWordObject(keywords[i], title);
            table.insertar(temp);
        }
        
    }

    public void addToAuthorTable(String[] autores, String title) {
        HashTable2 table = GlobalVariables.getAuthorTable();
        for (int i = 0; i < autores.length; i++) {
            KeyWordObject temp = new KeyWordObject(autores[i], title);
            table.insertar(temp);
        }
    }
     
}
