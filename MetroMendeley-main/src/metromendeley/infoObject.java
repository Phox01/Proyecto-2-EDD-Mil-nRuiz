/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

import javax.swing.JOptionPane;

/**
 *
 * @author leste
 */
public class infoObject {
    private String title;
    private String[] autores;
    private String summary;
    private String[] keywords;
    
    public infoObject(){
        title = null;
        autores = null;
        summary = null;
        keywords = null;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the autores
     */
    public String[] getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the keywords
     */
    public String[] getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }
    
    public String createInfo(){
        Functions v = new Functions();
        String p = "";
        p += "Titulo: " + getTitle() + "\n" + "Autores:" + "\n";
        for (int i = 0; i < getAutores().length; i++) {
            p += getAutores()[i] + "\n";
        }
        p += "Palabras claves: \n";
        for (int i = 0; i < getKeywords().length; i++) {
            p += getKeywords()[i] + ": " + v.countWords(getSummary(), getKeywords()[i]) + "\n";
        }
        return p;
    }

}
    

