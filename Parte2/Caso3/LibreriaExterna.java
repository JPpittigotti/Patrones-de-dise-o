package Parte2.Caso3;

// objetivo por hacer: implementar adapter para adaptar la libreria externa y modificar la llamada a metodo.

//Libreria externa - no modificar
public class LibreriaExterna {
    public void metodoExterno(){
        System.out.println("Funcionalidad externa sin modificar");
    }
}

// Adaptador base - a modificar para patron adapter
class Adaptador{
    private LibreriaExterna externa;

    public Adaptador(){
        externa = new LibreriaExterna();
    }

    public void funcionAdaptada(){
        externa.metodoExterno();
    }

}
