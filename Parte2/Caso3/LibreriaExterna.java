package Parte2.Caso3;

// objetivo por hacer: implementar adapter para adaptar la libreria externa y modificar la llamada a metodo.

//Libreria externa - no modificar
public class LibreriaExterna {
    public void metodoExterno(){
        System.out.println("Funcionalidad externa sin modificar");
    }
}

//Se crea esta interfaz para definir el motodo que espera el sistema
interface InterfazAdaptada {

    void funcionAdaptada();
    
}

// Adaptador base - a modificar para patron adapter
class Adaptador implements InterfazAdaptada{ // Implementamos la interfaz
    private LibreriaExterna externa;

    public Adaptador(){
        externa = new LibreriaExterna();
    }

    //Metodo adaptado
    @Override
    public void funcionAdaptada(){
        //llamamos al metodo del la libreria externa
        externa.metodoExterno();
    }

}

//Main de prueba
class Main {
    public static void main(String[] args) {
        InterfazAdaptada objeto = new Adaptador(); // se usa la interfaz creada
        objeto.funcionAdaptada(); // llamada al metodo adaptado
    }
}
