package Patron_Estructural.Elementos;

public class Sonido {
    
    boolean estado;

    public void encender(){
        System.out.println("Encendiendo Sonido");
        this.estado = true;
    }

    public void apagado(){
        System.out.println("Apangando Sondido");
        this.estado = false;
    }

    public void subirVolumen(){
        System.out.println("Subiendo volumen");
        this.estado = true;
    }

    public void bajarVolumen(){
        System.out.println("Bajando volumen");
        this.estado = false;
    }

}
