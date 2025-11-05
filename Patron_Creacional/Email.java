package Patron_Creacional;

public class Email implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviastes un Email");
    }
    
}
