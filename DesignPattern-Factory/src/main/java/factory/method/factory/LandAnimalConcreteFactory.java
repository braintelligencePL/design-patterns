package factory.method.factory;

import factory.method.factory.animal.land.Dinosaur;
import factory.method.factory.animal.land.Dog;

public class LandAnimalConcreteFactory implements AnimalFactory {

    @Override
    public String getAnimal() {

        return "Land Animals: \n" +
                new Dog().getName() + "\n" +
                new Dinosaur().getName() + "\n";
    }
}

