package factory.method.factory;

import factory.method.factory.animal.land.Dinosaur;
import factory.method.factory.animal.land.Dog;

public class LandAnimalConcreteFactory implements AnimalFactory {

    @Override
    public String getAnimal() {

        StringBuilder landAnimals = new StringBuilder();

        landAnimals.append("Land Animals: \n");
        landAnimals.append(new Dog().getName() + "\n");
        landAnimals.append(new Dinosaur().getName() + "\n");

        return landAnimals.toString();
    }
}

