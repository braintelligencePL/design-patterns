package factory.method.factory;

import factory.method.factory.animal.AnimalFactory;
import factory.method.factory.animal.ocean.Salmon;
import factory.method.factory.animal.ocean.Tuna;

public class OceanAnimalFactory implements AnimalFactory {

    @Override
    public String getAnimal() {

        StringBuilder oceanAnimals = new StringBuilder();

        oceanAnimals.append("Land Animals: \n");
        oceanAnimals.append(new Tuna().getName() + "\n");
        oceanAnimals.append(new Salmon().getName() + "\n");

        return oceanAnimals.toString();
    }
}
