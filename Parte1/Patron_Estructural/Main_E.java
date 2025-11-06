package Patron_Estructural;

import java.util.Scanner;

public class Main_E {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TeatroEnCasa teatro = new TeatroEnCasa();
        
        System.out.print("Que peliculas va a ver?: ");
        String pelicula = sc.nextLine();

        teatro.verPelicula(pelicula);
        teatro.apagarTeatro();

        sc.close();

    }

}
