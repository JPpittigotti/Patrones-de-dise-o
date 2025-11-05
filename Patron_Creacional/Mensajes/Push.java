package Patron_Creacional.Mensajes;

import Patron_Creacional.Notificacion;

public class Push implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviastes un Push");
    }
}
