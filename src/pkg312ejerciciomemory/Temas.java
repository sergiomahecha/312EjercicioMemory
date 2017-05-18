/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg312ejerciciomemory;

/**
 *
 * @author sergio
 */
public enum Temas {
    BANDERAS(""),DINOSAURIOS(""),MARIPOSAS("");
    private final String ficheros;
    private String reverso;

    public String getFicheros() {
        return ficheros;
    }

    public String getReverso() {
        return reverso;
    }


    private Temas(String ficheros) {
        this.ficheros = ficheros;
    }
    
}
