package simple.factory;

import simple.factory.factory.AnimalType;
import simple.factory.factory.SimpleFactory;

public class Application {
    public static void main(String[] args) {

        // Making SimpleFactory - Land Animals
        SimpleFactory simpleFactory= new SimpleFactory();
        System.out.println(simpleFactory.createAnimal(AnimalType.LAND));

        // Making SimpleFactory - Ocean Animals
        System.out.println(new SimpleFactory().createAnimal(AnimalType.OCEAN));


    }

}
