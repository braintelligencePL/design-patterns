package factory.method;

import factory.method.factory.AnimalFactory;
import factory.method.factory.LandAnimalConcreteFactory;
import factory.method.factory.OceanAnimalConcreteFactory;

public class Application {
    public static void main(String[] args) {

        // Making ConcreteFactory - Land Animals
        AnimalFactory animalFactory = new LandAnimalConcreteFactory();
        System.out.println(animalFactory.getAnimal());

        // Making ConcreteFactory - Ocean Animals
        System.out.println(new OceanAnimalConcreteFactory().getAnimal());

    }

}
