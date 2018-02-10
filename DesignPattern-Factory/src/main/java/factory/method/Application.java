package factory.method;

import factory.method.factory.LandAnimalConcreteFactory;
import factory.method.factory.OceanAnimalFactory;
import factory.method.factory.animal.AnimalFactory;

public class Application {
    public static void main(String[] args) {

        // Making ConcreteFactory - Land Animals
        AnimalFactory animalFactory = new LandAnimalConcreteFactory();
        System.out.println(animalFactory.getAnimal());

        // Making ConcreteFactory - Ocean Animals
        AnimalFactory oceanAnimals = new OceanAnimalFactory();
        System.out.println(oceanAnimals.getAnimal());


    }
}
