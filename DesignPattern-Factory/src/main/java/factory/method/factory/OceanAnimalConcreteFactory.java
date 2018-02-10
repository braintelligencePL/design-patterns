package factory.method.factory;

import factory.method.factory.animal.ocean.Salmon;
import factory.method.factory.animal.ocean.Tuna;

public class OceanAnimalConcreteFactory implements AnimalFactory {

    @Override
    public String getAnimal() {

        return "Ocean Animals: \n" +
                new Tuna().getName() + "\n" +
                new Salmon().getName() + "\n";
    }
}
