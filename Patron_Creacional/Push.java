package Patron_Creacional;

public class Push implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviastes un Push");
    }
}
