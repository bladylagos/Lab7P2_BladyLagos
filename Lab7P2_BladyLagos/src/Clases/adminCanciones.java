/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Gerardo Lagos
 */
public class adminCanciones {

    /*
            private ArrayList<persona> listaPersonas = new ArrayList();
    private File archivo = null;
     */
    private ArrayList<Canciones> listaCanciones = new ArrayList();
    private File archivo = null;

    public adminCanciones(String path) {
        archivo = new File(path);
    }

    public ArrayList<Canciones> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Canciones> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaAlbumes=" + listaCanciones;
    }

    //extra mutador
    public void setCanciones(Canciones p) {
        this.listaCanciones.add(p);
    }

    public void cargarArchivo() {
        try {
            listaCanciones = new ArrayList();
            Canciones temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Canciones) objeto.readObject()) != null) {
                        listaCanciones.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Canciones t : listaCanciones) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
