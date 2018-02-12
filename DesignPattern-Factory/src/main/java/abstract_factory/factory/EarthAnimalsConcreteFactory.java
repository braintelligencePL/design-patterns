package abstract_factory.factory;

import abstract_factory.factory.animal.land.Dinosaur;
import abstract_factory.factory.animal.land.Dog;
import abstract_factory.factory.animal.ocean.Salmon;
import abstract_factory.factory.animal.ocean.Tuna;

public class EarthAnimalsConcreteFactory implements EarthAnimalsFactory {

    @Override
    public String getLandAnimals() {
        return "Land Animals: \n" +
                new Dog().getName() + "\n" +
                new Dinosaur().getName() + "\n";
    }

    @Override
    public String getOceanAnimals() {
        return "Ocean Animals: \n" +
                new Tuna().getName() + "\n" +
                new Salmon().getName() + "\n";

    }
}

