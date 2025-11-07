package Parte2.Caso4;

// Objetivo por hacer: Crear al menos dos decoradores que extiendadn Animal para añadir comportamientos adicionales

//Primero pasamos animal de clase a interfaz
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

// Se crea el decorador 1: Añade Sonido Fuerte
class SonidoFuerteDecorator extends Animal {

    private Animal animal;

    public SonidoFuerteDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void hacerSonido(){
        animal.hacerSonido(); // Comportamiento base
        System.out.println("¡SONIDO GENERICO DE ANIMAL MAS FUERTE!"); // Se añade comportamiento extra
    }
}

//Se crea el decorador 2: Añade el eco
class EcoDecorator extends Animal {

    private Animal animal;

    public EcoDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void hacerSonido(){
        animal.hacerSonido(); // Comportamiento base
        System.out.println("(Eco... eco... eco...)"); //Se añade nuevo comportamiento
    }
}

//Main de pruba
class Main {
    public static void main(String[] args) {

        // Animal normal
        Animal animal = new Animal();
        animal.hacerSonido();
    
        //prueba del primero decorador
        System.out.println("\nUsando SonidoFuerteDecorator:");
        Animal animalFuerte = new SonidoFuerteDecorator(animal);
        animalFuerte.hacerSonido();

        //Prueba del segundo decorador
        System.out.println("\nUsando EcoDecorator:");
        Animal animalConEco = new EcoDecorator(animal);
        animalConEco.hacerSonido();

        //Prueba de combinar el primer y segundo decorador
        System.out.println("\nCombinando ambos decoradores:");
        Animal combinado = new EcoDecorator(new SonidoFuerteDecorator(animal));
        combinado.hacerSonido();
    }
}