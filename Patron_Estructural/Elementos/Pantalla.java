package Patron_Estructural.Elementos;

public class Pantalla {
    
    boolean estado;

    public void encender(){
        System.out.println("Encendiendo Televisor");
        this.estado = true;
    }

    public void apagado(){
        System.out.println("Apangando Televisor");
        this.estado = false;
    }

}
