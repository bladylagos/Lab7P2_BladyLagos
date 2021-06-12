/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Gerardo Lagos
 */
public class Canciones implements Serializable {

    private String nombre3;
    private String duracion3;//(en segundos)
    private String compositor3;
    private String distribuidor3;
    private String exclusiva3;//a Spotify (si o no)
    private String productor3;
    private String invitado3;//(si aplica)

    private static final long SerialVersionUID = 777L;

    public Canciones() {
    }

    public Canciones(String nombre3, String duracion3, String compositor3, String distribuidor3, String exclusiva3, String productor3, String invitado3) {
        this.nombre3 = nombre3;
        this.duracion3 = duracion3;
        this.compositor3 = compositor3;
        this.distribuidor3 = distribuidor3;
        this.exclusiva3 = exclusiva3;
        this.productor3 = productor3;
        this.invitado3 = invitado3;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getDuracion3() {
        return duracion3;
    }

    public void setDuracion3(String duracion3) {
        this.duracion3 = duracion3;
    }

    public String getCompositor3() {
        return compositor3;
    }

    public void setCompositor3(String compositor3) {
        this.compositor3 = compositor3;
    }

    public String getDistribuidor3() {
        return distribuidor3;
    }

    public void setDistribuidor3(String distribuidor3) {
        this.distribuidor3 = distribuidor3;
    }

    public String getExclusiva3() {
        return exclusiva3;
    }

    public void setExclusiva3(String exclusiva3) {
        this.exclusiva3 = exclusiva3;
    }

    public String getProductor3() {
        return productor3;
    }

    public void setProductor3(String productor3) {
        this.productor3 = productor3;
    }

    public String getInvitado3() {
        return invitado3;
    }

    public void setInvitado3(String invitado3) {
        this.invitado3 = invitado3;
    }

    @Override
    public String toString() {
        return nombre3;
    }

}
