package Parte2.Caso1;

//objetivo por hacer: aplicar singleton en la clase configuracion para que solo exista una instancia

public class Configuracion {
    private static Configuracion instancia = null;
    private String configValor;

    // Primera pasamos el constructor a privado;
    private Configuracion(){
        configValor = "Valor por defecto";
    }

    // Creamos el metodo para obtener una sola instancia
    public static Configuracion getInstancia(){
        
        // si la instancia es null, lo instanciamos con new
        if(instancia == null){
            instancia =  new Configuracion();
        }
        
        //retornamos la instancia privada dentro de la clase
        return instancia;
    }

    public String getConfigValor(){
        return configValor;
    }

    public void setConfigValor(String valor){
        this.configValor = valor;
    }

}

// pequeño main de prueba
class Main{
    public static void main(String[] args) {
        
        Configuracion co1 = Configuracion.getInstancia();
         Configuracion co2 = Configuracion.getInstancia();

        System.out.println(co1);

        System.out.println(co2);

    }
}
