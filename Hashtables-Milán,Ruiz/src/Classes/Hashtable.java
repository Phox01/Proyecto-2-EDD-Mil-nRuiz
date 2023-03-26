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
public class Hashtable {
    
    private Object[] array;
    
    private int size;

    public Hashtable() {
        this.array = new Object[8009];
        this.size = 8009;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
    
    public int NumeroHash(Resumen res){//String titulo){
        
          int numero =0;  
        
       String titulo= res.getTitle();
    for (int i=0; i < titulo.length(); i++){
        int contador = 0;
        
        contador = titulo.codePointAt(i); 
        
        numero=numero + (contador*i);
       
    }
    
        numero=numero%8009;
        
        return numero;
    }

    
}
