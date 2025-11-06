package Patron_Estructural;

import Patron_Estructural.Elementos.*;

public class TeatroEnCasa {

    Proyector proyector;
    Pantalla pantalla;
    Sonido sonido;
    Reproductor reproductor;

    public TeatroEnCasa() {

        proyector = new Proyector();
        pantalla = new Pantalla();
        sonido = new Sonido();
        reproductor = new Reproductor();

    }

    public TeatroEnCasa(Proyector pro, Pantalla pan, Sonido son, Reproductor rep) {

        proyector = pro;
        pantalla = pan;
        sonido = son;
        reproductor = rep;

    }



    public void verPelicula(String pelicula){
        System.out.println("\nPreparando el Sistema.....\n");
        proyector.encender();
        pantalla.encender();
        sonido.encender();
        sonido.subirVolumen();
        reproductor.encender();
        reproductor.reproducir(pelicula);
        System.out.println("\nDisfruta de > " +  pelicula + " < ....\n");
    }

    void apagarTeatro(){
        reproductor.apagado();
        sonido.apagado();
        pantalla.apagado();
        proyector.apagado();
        System.out.println("Sistema apagado correctamente");
    }

}
