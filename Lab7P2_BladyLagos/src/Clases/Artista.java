/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gerardo Lagos
 */
public class Artista {
    private String nombre1;
    private String genero1;
    private String disquera1;
    private String alias1;
    private String vos1;

    public Artista() {
    }

    public Artista(String nombre1, String genero1, String disquera1, String alias1, String vos1) {
        this.nombre1 = nombre1;
        this.genero1 = genero1;
        this.disquera1 = disquera1;
        this.alias1 = alias1;
        this.vos1 = vos1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public String getDisquera1() {
        return disquera1;
    }

    public void setDisquera1(String disquera1) {
        this.disquera1 = disquera1;
    }

    public String getAlias1() {
        return alias1;
    }

    public void setAlias1(String alias1) {
        this.alias1 = alias1;
    }

    public String getVos1() {
        return vos1;
    }

    public void setVos1(String vos1) {
        this.vos1 = vos1;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre1=" + nombre1 + '}';
    }
    
    
}
