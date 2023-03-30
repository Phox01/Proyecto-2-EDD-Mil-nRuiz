/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import javax.swing.JOptionPane;
import Classes.Hashtable;
import Classes.HashTableTitulos;
import Classes.HashTableTitulosAutores;
import Classes.ListaTitulos;
import Classes.ListaAutores;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class GUIFunctions {

    ArchivoTxt archivo = new ArchivoTxt();

    public void introducing(boolean valueValidation, boolean valueJOPTION, Resumen resumen, Hashtable hashtable, File file, HashTableTitulos hashtable2, ListaPalabrasClave listapalabarasclave, ListaAutores listaAutores, HashTableTitulosAutores hashtable3) {
        if (valueValidation == true) {
            JOptionPane.showMessageDialog(null, "Oooops, el error se pudo deber a:\nEl resumen tiene algún campo vacío \nEl resumen no tiene el formato correspondiente");
        } else {
            hashtable.introduceInHashtable(resumen);
            introducePalabrasClaves(resumen, hashtable2);
            introduceAutores(resumen, hashtable3);
            valueValidation = archivo.copyTxt(file, resumen.getTitle());
            InsertarListaClave(listapalabarasclave, resumen);
            InsertarListaAutores(listaAutores, resumen);
            if (valueJOPTION != false && valueValidation != false) {
                JOptionPane.showMessageDialog(null, "El resumen fue introducido con éxito :)");

            }

        }
    }

    public String analizeSummary(String texto, int numeroBusqueda, Resumen res) {
        String mostrar = "";
        String hola = res.getBody();
        String[] resumenDividido = hola.split(" ");

        System.out.println(res.getKeywords().length);

        for (int i = 0; i < res.getKeywords().length; i++) {
            String palabra = "";

            boolean value = true;

            String[] palabraDividida = res.getKeywords()[i].split(" ");
            if (palabraDividida.length > 1) {
                for (int j = 0; j < palabraDividida.length; j++) {
                    palabra += palabraDividida[j] + " ";

                }
                value = false;
            }

            int contador = 0;
            if (value == true) {
                palabra = res.getKeywords()[i];
            }

            System.out.println(palabra);
            for (int k = 0; k < resumenDividido.length; k++) {
                boolean palabraLargaMatch = true;
                String palabraRecorriendo = resumenDividido[k];
                if (value == false) {
                    if (palabraRecorriendo.toLowerCase().equals(palabraDividida[0])) {
                        for (int l = 1; l < palabraDividida.length; l++) {
                            palabraRecorriendo = resumenDividido[k + l];
                            if ((!(palabraRecorriendo.equals(palabraDividida[l]))) && (!(palabraRecorriendo.equals(palabraDividida[l] + ","))) && (!(palabraRecorriendo.equals(palabraDividida[l] + "."))) && (!(palabraRecorriendo.toLowerCase().equals(palabraDividida[l])))) {
                                palabraLargaMatch = false;
                            }
                        }
                        if (palabraLargaMatch == true) {
                            contador++;
                        }
                    }
                } else {
                    if (resumenDividido[k].contains(palabra)) {
                        contador++;
                    }

                }

            }
            mostrar += "Palabra clave: " + palabra + " aparece " + Integer.toString(contador) + " veces\n";

        }
        return mostrar;
    }

    public String optionMostrarKeywords(String palabra, Hashtable hashtable) {

        int numero = hashtable.NumeroHashtable(palabra);

        String texto = "";

        texto = texto + palabra + "\n" + "-----Autores-----\n";

        for (int i = 0; i < hashtable.getArray()[numero].getAuthors().length; i++) {

            texto = texto + hashtable.getArray()[numero].getAuthors()[i] + "\n";
        }

        texto = texto + "###Palabras Claves###\n";

        for (int i = 0; i < hashtable.getArray()[numero].getKeywords().length; i++) {

            texto = texto + "-" + hashtable.getArray()[numero].getKeywords()[i] + "\n";
        }
        return texto;
    }

    public String mostrarAutores(String palabra, Hashtable hashtable) {

        int numero = hashtable.NumeroHashtable(palabra);

        String texto = "";

        texto = texto + palabra + "\n" + "-----Autores-----\n";

        for (int i = 0; i < hashtable.getArray()[numero].getAuthors().length; i++) {

            texto = texto + hashtable.getArray()[numero].getAuthors()[i] + "\n";
        }

        texto = texto + "###Palabras Claves###\n";

        for (int i = 0; i < hashtable.getArray()[numero].getKeywords().length; i++) {

            texto = texto + "-" + hashtable.getArray()[numero].getKeywords()[i] + "\n";
        }
        return texto;
    }

    public void introducePalabrasClaves(Resumen resumen, HashTableTitulos hashtable2) {

        for (int i = 0; i < resumen.getKeywords().length; i++) {

            int numero = hashtable2.NumeroHashtableTitulo(resumen.getKeywords()[i]);
            String titulo = resumen.getTitle();

            if (hashtable2.getArray()[numero] == null) {

                ListaTitulos listat = new ListaTitulos();
                hashtable2.getArray()[numero] = listat;

                hashtable2.getArray()[numero].InsertarPrimero(titulo);
            } else {

                hashtable2.getArray()[numero].InsertarPrimero(titulo);
            }

        }

    }

    public void introduceAutores(Resumen resumen, HashTableTitulosAutores hashtable3) {
        for (int i = 0; i < resumen.getAuthors().length; i++) {

            int numero = hashtable3.NumeroHashtableTituloAutores(resumen.getAuthors()[i]);
            String titulo = resumen.getTitle();

            if (hashtable3.getArray()[numero] == null) {

                ListaTitulos listat = new ListaTitulos();
                hashtable3.getArray()[numero] = listat;

                hashtable3.getArray()[numero].InsertarPrimero(titulo);
            } else {

                hashtable3.getArray()[numero].InsertarPrimero(titulo);
            }

        }

    }

    public void InsertarListaClave(ListaPalabrasClave listapalabarasclave, Resumen resumen) {

        for (int i = 0; i < resumen.getKeywords().length; i++) {

            listapalabarasclave.InsertarPrimero(resumen.getKeywords()[i]);

        }

    }

    public void InsertarListaAutores(ListaAutores listaAutores, Resumen resumen) {

        for (int i = 0; i < resumen.getAuthors().length; i++) {

            listaAutores.InsertarPrimero(resumen.getAuthors()[i]);

        }

    }

    public void openingDatabase(Hashtable hashtable, HashTableTitulos hashtableTitulos, ListaPalabrasClave listapalabarasclave, ListaAutores listaAutores, HashTableTitulosAutores hashtableTitulosAutores) {
        File folder = new File("SavedData/");
        File[] listOfFiles = folder.listFiles();
        try {
            for (File tempFile : listOfFiles) {
                Object[] array = archivo.readTxt(false, tempFile);
                System.out.println(tempFile.getName());
                boolean valueValidation = ((Resumen) array[1]).isEmpty();
                if (valueValidation == true) {
                    JOptionPane.showMessageDialog(null, "El resumen " + tempFile.getName() + " no pudo ser introducido por su formato o porque se encuentra vacío");

                } else {
                    introducing(valueValidation, false, (Resumen) array[1], hashtable, tempFile, hashtableTitulos, listapalabarasclave, listaAutores, hashtableTitulosAutores);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
