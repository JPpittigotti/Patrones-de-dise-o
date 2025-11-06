package Parte2.Caso4;

// Objetivo por hacer: Crear al menos dos decoradores que extiendadn Animal para añadir comportamientos adicionales

public class Animal {
    public void hacerSonido(){
        System.out.println("Sonido generico de animal");
    }
}

class AnimalDecorator extends Animal {
    protected Animal animal;

    public AnimalDecorator (Animal animal){
        this.animal = animal;
    }

    @Override
    public void hacerSonido(){
        animal.hacerSonido();
    }

}
