package simple.factory;

import simple.factory.factory.AnimalType;
import simple.factory.factory.EarthAnimalsFactory;

public class Application {
    public static void main(String[] args) {

        // Making EarthAnimalsFactory - Land Animals
        EarthAnimalsFactory earthAnimalsFactory = new EarthAnimalsFactory();
        System.out.println(earthAnimalsFactory.createAnimal(AnimalType.LAND));

        // Making EarthAnimalsFactory - Ocean Animals
        System.out.println(new EarthAnimalsFactory().createAnimal(AnimalType.OCEAN));


    }

}
