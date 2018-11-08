package com.example.dm2.actividadfragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class FragmentListado extends Fragment{

    private ListView lista;
    private ListaListener listener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fargemento_lista, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onActivityCreated(Bundle state) {

        super.onActivityCreated(state);

        lista=(ListView) getView().findViewById(R.id.lista_discos);
        final Disco[] debs= new Disco[]{new Disco("Showbiz ","12 canciones", getContext().getDrawable(R.mipmap.ic_showbiz),"Fue lanzado en el Reino Unido bajo la productora Taste Media, el 7 de septiembre de 1999 en Francia, el 28 de septiembre en los Estados Unidos y el 4 de octubre en el resto del mundo. Es considerado el disco más «crudo» de la banda, al poseer un sonido simple, sin tantos arreglos o experimentaciones que caracterizan a los discos siguientes."),
                new Disco("Origin of Symmetry","11 canciones",getContext().getDrawable(R.mipmap.ic_origin),"El origen de la simetría— es el segundo álbum de estudio de la banda británica de rock alternativo, Muse, lanzando en el verano de 2001 por Mushroom Records en el Reino Unido. Sus sencillos fueron “Plug in Baby”, “New Born”, “Bliss” e “Hyper Music/Feeling Good”."),
                new Disco("Absolution","14 canciones",getContext().getDrawable(R.mipmap.ic_absolution),"Fue lanzado al mercado el 29 de septiembre de 2003 en el Reino Unido. Fue el primer disco de la banda en editarse en Latinoamérica, bajo el sello discográfico Warner Bros. Una edición especial incluía un DVD de 35 minutos que incluía entrevistas y escenas de la grabación, en las que se puede observar los poco ortodoxos métodos que se usaron para la producción, como cuando el baterista Dominic Howard sumergido en una piscina hasta la cintura mientras golpea dos tambores, o el golpeo de latas contra el suelo para simular una marcha"),
                new Disco("Black Holes and Revelations","11 cancione",getContext().getDrawable(R.mipmap.ic_blackholes),"Agujeros Negros y Revelaciones” es el nombre del cuarto álbum de estudio de la banda británica de rock alternativo, Muse, que salió el 3 de julio de 2006. Es el cuarto álbum del grupo comandado por Matthew Bellamy. De este álbum sacaron los sencillos: Supermassive Black Hole, Starlight, Knights of Cydonia, Invincible y Map of the Problematique ."),
                new Disco("The 2nd Law","13 cancione",getContext().getDrawable(R.mipmap.ic_law),"“La 2ª Ley”, es el nombre del sexto disco de la banda británica Muse, después de The Resistance, lanzado al mercado en los comienzos del mes de octubre de 2012. Es el primer álbum en el que Chris Wolstenholme es la voz principal en dos canciones."),
                new Disco("The Resistance","11 canciones",getContext().getDrawable(R.mipmap.ic_resistance),"(La Resistencia) es el nombre del quinto álbum de estudio de la banda británica Muse, publicado en Europa el 14 de septiembre de 2009 y en América del Norte el 15 de septiembre de 2009. El álbum fue producido por la banda y mezclado por Mark Stent. Fue grabado en el estudio privado de la banda, en la residencia del vocalista Matt Bellamy en el Lago Como y en Milán, Italia.1\u200B El proceso de promoción y lanzamiento destacó por su extensivo uso de Internet, como el portal de vídeos YouTube y principalmente la red social Twitter, en la que se realizó un seguimiento de la grabación del álbum mediante la publicación de fotografías y noticias. ")};
        AdaptadorPropio adaptador= new AdaptadorPropio(getContext(),debs);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int pos, long id)
            {
                if (listener != null)

                    listener.onDiscoSeleccionado((Disco)lista.getAdapter().getItem(pos));
            }
        });
    }

    public interface ListaListener {
        void onDiscoSeleccionado(Disco c);
    }

    public void setListaListener (ListaListener listener){
        this.listener = listener;
    }
}
