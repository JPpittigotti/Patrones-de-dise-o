package Parte2.Caso2;

// Objetivo por hacer: Usar factory method para crear distintos tipos de usuarios (normal,admin,invitado)


public class Usuario {

    private String nombre;

    public Usuario (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void mostrarTipo(){
        System.out.println("Soy un usuario general");
    }
    
}

class UsuarioFactory {
    public Usuario creaUsuario(String tipo, String nombre){
        if(tipo.equalsIgnoreCase("normal")){
            return new Usuario(nombre);
        }
        // Otros tipos: admin, invitado (por implementar)
        return null;
    }
}
