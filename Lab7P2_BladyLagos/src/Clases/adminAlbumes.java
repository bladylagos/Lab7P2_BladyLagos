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
public class adminAlbumes {

    private ArrayList<Albumes> listaAlbumes = new ArrayList();
    private File archivo = null;

    public adminAlbumes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Albumes> getListaAlbumes() {
        return listaAlbumes;
    }

    public void setListaAlbumes(ArrayList<Albumes> listaAlbumes) {
        this.listaAlbumes = listaAlbumes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String toString() {
        return "listaAlbumes=" + listaAlbumes;
    }

    //extra mutador
    public void setAlbumes(Albumes p) {
        this.listaAlbumes.add(p);
    }

    public void cargarArchivo() {
        try {
            listaAlbumes = new ArrayList();
            Albumes temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Albumes) objeto.readObject()) != null) {
                        listaAlbumes.add(temp);
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
            for (Albumes t : listaAlbumes) {
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
