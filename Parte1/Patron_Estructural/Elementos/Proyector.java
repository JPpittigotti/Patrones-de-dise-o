package Patron_Estructural.Elementos;

public class Proyector {
    boolean estado;

    public void encender(){
        System.out.println("Encendiendo Proyector");
        this.estado = true;
    }

    public void apagado(){
        System.out.println("Apangando Proyector");
        this.estado = false;
    }
}
