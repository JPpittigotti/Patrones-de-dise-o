package Patron_de_Comportamiento;


public class Main {

    public static void main(String[] args) {

        ListaCanciones lista = new ListaCanciones(5);
        lista.agregarCancion("Soy un Cacahuate");
        lista.agregarCancion("In The End");
        lista.agregarCancion("There's a starman waiting in the sky");
        lista.agregarCancion("Megalovania");

        Iterador iterador = lista.crearIterador();

        System.out.println("##################################");
        
        System.out.println("Reproduciendo Playlist:\n");
        while(iterador.tieneSiguiente()){
            System.out.println(iterador.siguiente());
        }

        System.out.println("##################################");

    }
}


