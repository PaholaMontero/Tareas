package com.example.ger.myapplication;

/**
 * Created by ger on 02/06/2015.
 */
public class Lista_entrada {

    private int idImagen;
    private String textoDia;
    private String textoEstado;
    private String textoGrados;


    public Lista_entrada (int idImagen, String textoDia, String textoEstado, String textoGrados) {
        this.idImagen = idImagen;
        this.textoDia = textoDia;
        this.textoEstado = textoEstado;
        this.textoGrados = textoGrados;
    }

    public String get_textoEncima() {
        return textoDia;
    }

    public String get_textoDebajo() {
        return textoEstado;
    }

    public String get_textoGrados() {
        return textoGrados;
    }

    public int get_idImagen() {
        return idImagen;
    }
}
