/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Resumen {

    private String title;
    private String[] authors;
    private String body;
    private String[] keywords;

    public Resumen(String title, String[] authors, String body, String[] keywords) {
        this.title = title;
        this.authors = authors;
        this.body = body;
        this.keywords = keywords;
    }

    public boolean isEmpty() {
        if (getKeywords()[0] == "" || getAuthors()[0] == "" || getBody() == "" || getTitle() == "") {
            return true;
        }
        return false;
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
     * @return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String [] authors) {
        this.authors = authors;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the keywords
     */
    public String []getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String [] keywords) {
        this.keywords = keywords;
    }

}
