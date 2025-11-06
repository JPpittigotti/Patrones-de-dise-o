package Patron_Estructural.Elementos;

public class Reproductor {
    boolean estado;

    public void encender(){
        System.out.println("Encendiendo Reproductor");
        this.estado = true;
    }

    public void apagado(){
        System.out.println("Apangando Reproductor");
        this.estado = false;
    }

    public void reproducir(String pelicula){
        System.out.println("Reproduciendo > " + pelicula);
    }
}
