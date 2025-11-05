package Patron_Creacional;

import java.util.Scanner;

public class Main_C {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        NotificacionFactory nf = new NotificacionFactory();

        try {

            System.out.println("#############################\n");
            System.out.println("1. Email");
            System.out.println("2. SMS");
            System.out.println("3. PUSH");
            System.out.print("Escriba el tipo de notificacion que quiere enviar > ");

            String op = sc.nextLine();

            Notificacion notificacion = nf.crearNotificacion(op);

            if(notificacion != null){
                notificacion.enviar();

            }else{
                System.out.println("Tipo no valido");
            }        

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();

    }

}
