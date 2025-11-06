package Patron_de_Comportamiento;

public class CancionIterator implements Iterador {

    private String[] canciones;
    private int posicion = 0;
    private int total;

    public CancionIterator(String[] canciones, int total){
        this.canciones = canciones;
        this.total = total;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < total;
    }

    @Override
    public String siguiente() {
        String cancion = canciones[posicion];
        posicion++;
        return cancion;
    }
}

