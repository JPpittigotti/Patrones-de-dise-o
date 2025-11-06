package Patron_de_Comportamiento;

public class ListaCanciones {

    private String[] canciones;
    private int indice = 0;

    public ListaCanciones(int tamano){
        canciones = new String[tamano];
    }

    public void agregarCancion(String cancion){
        canciones[indice] = cancion;
        indice++;
    }

    public Iterador crearIterador(){
        return new CancionIterator(canciones, indice);
    }
}