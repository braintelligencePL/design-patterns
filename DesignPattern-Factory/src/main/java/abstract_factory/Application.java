package abstract_factory;

import abstract_factory.factory.EarthAnimalsFactory;
import abstract_factory.factory.EarthAnimalsConcreteFactory;

public class Application {
    public static void main(String[] args) {

        // Making ConcreteFactory - Land Animals
        EarthAnimalsFactory earthAnimalFactory = new EarthAnimalsConcreteFactory();

        System.out.println(earthAnimalFactory.getLandAnimals());
        System.out.println(earthAnimalFactory.getOceanAnimals());

    }

}
