/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

/**
 *
 * @author leste
 */
public class GlobalVariables {
    private static HashTable1 table = new HashTable1(1000);
    private static List lista = new List(null);
    private static ListObject objetos = new ListObject(null);
    private static HashTable2 keywordTable = new HashTable2(1009);
    private static HashTable2 authorTable = new HashTable2(1009);

    /**
     * @return the table
     */
    public static HashTable1 getTable() {
        return table;
    }

    /**
     * @param aTable the table to set
     */
    public static void setTable(HashTable1 aTable) {
        table = aTable;
    }

    /**
     * @return the lista
     */
    public static List getLista() {
        return lista;
    }

    /**
     * @param aLista the lista to set
     */
    public static void setLista(List aLista) {
        lista = aLista;
    }

    /**
     * @return the objetos
     */
    public static ListObject getObjetos() {
        return objetos;
    }

    /**
     * @param aObjetos the objetos to set
     */
    public static void setObjetos(ListObject aObjetos) {
        objetos = aObjetos;
    }

    public static HashTable2 getKeywordTable() {
        return keywordTable;
    }

    public static void setKeywordTable(HashTable2 keywordTable) {
        GlobalVariables.keywordTable = keywordTable;
    }

    public static HashTable2 getAuthorTable() {
        return authorTable;
    }

    public static void setAuthorTable(HashTable2 authorTable) {
        GlobalVariables.authorTable = authorTable;
    }
    
}
