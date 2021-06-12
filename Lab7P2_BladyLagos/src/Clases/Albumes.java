/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gerardo Lagos
 */
public class Albumes implements Serializable {

    private String nombre2;
    private String fecha2;
    private String genero2;
    private String formato2;//(digital o cd)
    private String alias2;//productor
    Artista c;
    File archivo;
    private ArrayList<Albumes> ListaAlbumes = new ArrayList();

    private static final long SerialVersionUID = 777L;

    public Albumes() {
    }

    public Albumes(String nombre2, String fecha2, String genero2, String formato2, String alias2) {
        this.nombre2 = nombre2;
        this.fecha2 = fecha2;
        this.genero2 = genero2;
        this.formato2 = formato2;
        this.alias2 = alias2;

    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public String getFormato2() {
        return formato2;
    }

    public void setFormato2(String formato2) {
        this.formato2 = formato2;
    }

    public String getAlias2() {
        return alias2;
    }

    public void setAlias2(String alias2) {
        this.alias2 = alias2;
    }
//
//    public Artista getC() {
//        return c;
//    }
//
//    public void setC(Artista c) {
//        this.c = c;
//    }

    public ArrayList<Albumes> getListaAlbumes() {
        return ListaAlbumes;
    }

    public void setListaAlbumes(ArrayList<Albumes> ListaAlbumes) {
        this.ListaAlbumes = ListaAlbumes;
    }

    public String toStringAlbumes() {
        return "El Album Creado +" + nombre2 + "Con El Artista" + c + "Y fecha=" + fecha2 + ", genero=" + genero2 + ", formato=" + formato2 + ", alias=" + alias2;
    }// + ", ListaAlbumes=" + ListaAlbumes + '}'

}
