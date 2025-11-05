package Patron_Creacional;

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
