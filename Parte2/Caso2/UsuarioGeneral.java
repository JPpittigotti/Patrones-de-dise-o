package Parte2.Caso2;

// Objetivo por hacer: Usar factory method para crear distintos tipos de usuarios (normal,admin,invitado)

// Creamos la interfaz de usuario que debe implementar todas los tipos de usuario
interface Usuario {

    void mostrarTipo();
    
}

//Creamos una clase para los tipos de usuarios que faltan, implimentandoles la interface Usuario
public class UsuarioGeneral implements Usuario {

    private String nombre;

    public UsuarioGeneral (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarTipo(){
        System.out.println("Mi nombre es " + nombre  + " y soy un usuario general");
    }
    
}

class UsuarioAdmin implements Usuario{

    private String nombre;

    public UsuarioAdmin (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarTipo(){
        System.out.println("Mi nombre es " + nombre + " y soy un usuario Admin");
    }

}

class UsuarioInvitado implements Usuario{

    private String nombre;

    public UsuarioInvitado (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarTipo(){
        System.out.println("Mi nombre es " + nombre + " y soy un usuario Invitado");
    }

}

//Agregamos los tipos de usuario a la clase factory
class UsuarioFactory {

    public Usuario creaUsuario(String tipo, String nombre){
        if(tipo.equalsIgnoreCase("normal")){
            return new UsuarioGeneral(nombre);
        }

        if(tipo.equalsIgnoreCase("admin")){
            return new UsuarioAdmin(nombre);
        }

        if(tipo.equalsIgnoreCase("invitado")){
            return new UsuarioInvitado(nombre);
        }

        return null;
    }

}

//Pequeño main para probar que funciona
class Main{

    public static void main(String[] args) {
        
        UsuarioFactory uf = new UsuarioFactory();

        Usuario usuario1 = uf.creaUsuario("admin", "Mario");
        Usuario usuario2 = uf.creaUsuario("normal", "Luigi");
        Usuario usuario3 = uf.creaUsuario("invitado", "Toad");

        usuario1.mostrarTipo();
        usuario2.mostrarTipo();
        usuario3.mostrarTipo();

    }

}
