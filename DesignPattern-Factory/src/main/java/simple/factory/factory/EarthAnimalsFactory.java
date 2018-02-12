package simple.factory.factory;


import simple.factory.factory.animal.land.Dinosaur;
import simple.factory.factory.animal.land.Dog;
import simple.factory.factory.animal.ocean.Salmon;
import simple.factory.factory.animal.ocean.Tuna;

public class EarthAnimalsFactory {

    public String createAnimal(AnimalType animalType) {

        switch (animalType) {
            case LAND:
                return createLandAnimals();
            case OCEAN:
                return createOceanAnimals();

            default:
                throw new IllegalArgumentException("There is no such Animal");
        }

    }

    private String createOceanAnimals() {
        return "Land Animals: \n" +
                new Salmon().getName() + "\n" +
                new Tuna().getName() + "\n";
    }

    private String createLandAnimals() {
        return "Ocean Animals: \n" +
                new Dinosaur().getName() + "\n" +
                new Dog().getName() + "\n";
    }

}

