package com.example.dm2.actividadfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPropio extends ArrayAdapter<Disco> {

    private Disco[] datos;

    public AdaptadorPropio(Context context, Disco[] datos) {

        super(context, R.layout.discos, datos);
        this.datos=datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.discos, null);

        TextView nombre = (TextView)item.findViewById(R.id.nombre_disco);
        nombre.setText(datos[position].getNombre());

        TextView canciones = (TextView)item.findViewById(R.id.canciones);
        canciones.setText(datos[position].getCanciones());

        ImageView imagen = (ImageView) item.findViewById(R.id.foto_disco);
        imagen.setImageDrawable(datos[position].getFotodisco());
        return(item);
    }
}