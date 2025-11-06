package Patron_Creacional.Mensajes;

import Patron_Creacional.Notificacion;

public class Sms implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviastes un SMS");
    }

}
