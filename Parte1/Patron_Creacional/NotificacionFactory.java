package Patron_Creacional;

import Patron_Creacional.Mensajes.Email;
import Patron_Creacional.Mensajes.Push;
import Patron_Creacional.Mensajes.Sms;

public class NotificacionFactory {

    public Notificacion crearNotificacion(String tipo){
        if (tipo.equalsIgnoreCase("email")){
            return new Email();
        }

        if (tipo.equalsIgnoreCase("sms")){
            return new Sms();
        }

        if (tipo.equalsIgnoreCase("Push")){
            return new Push();
        }

        return null;
    }
    
}
