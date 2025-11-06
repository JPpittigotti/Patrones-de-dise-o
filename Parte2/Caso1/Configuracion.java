package Parte2.Caso1;

//objetivo por hacer: aplicar singleton en la clase configuracion para que solo exista una instancia

public class Configuracion {
    private static Configuracion instancia =  null;
    private String configValor;

    public Configuracion(){
        configValor = "Valor por defecto";
    }

    public String getConfigValor(){
        return configValor;
    }

    public void setConfigValor(String valor){
        this.configValor = valor;
    }

}
