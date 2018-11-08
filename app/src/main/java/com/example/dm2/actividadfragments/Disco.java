package com.example.dm2.actividadfragments;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

public class Disco extends AppCompatActivity {

    private String nombre;
    private String canciones;
    private Drawable fotodisco;
    private String informacion;

    public Disco(String nom, String song, Drawable img,String info){

        nombre=nom;
        this.canciones=song;
        this.fotodisco=img;
        informacion=info;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCanciones() {
        return canciones;
    }

    public Drawable getFotodisco() {
        return fotodisco;
    }

    public String getInfo() {
        return informacion;
    }
}
