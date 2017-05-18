/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg312ejerciciomemory;

import java.util.HashMap;

/**
 *
 * @author sergio
 */
public class Carta extends HashMap<ClavesCarta, Object>{

    public Carta(String archivoImagen) {
        this.put(ClavesCarta.imagenCarta, archivoImagen);
    }

    public String getArchivoImagen() {
        return (String)this.get(ClavesCarta.imagenCarta);
    }

    public boolean isTapada() {
        return (boolean)this.get(ClavesCarta.tapada);
    }

    public void setImagenCarta(String FicheroImagen){
        this.put(ClavesCarta.imagenCarta, FicheroImagen);
    }
    
    public void setTapada(boolean tapada){
        this.put(ClavesCarta.tapada, tapada);
    }
    
}
