package Patron_Creacional;

public class Sms implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviastes un SMS");
    }

}
