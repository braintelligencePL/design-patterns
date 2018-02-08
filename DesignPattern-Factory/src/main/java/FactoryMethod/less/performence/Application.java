package FactoryMethod.less.performence;

import FactoryMethod.less.performence.factory.ComputersFactory;
import FactoryMethod.less.performence.model.Computer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        long startTIme = System.nanoTime();
        Computer result = ComputersFactory.getComputer(ComputersFactory.ComputerType.PC);
        LOGGER.info(String.valueOf(System.nanoTime() - startTIme));

    }
}
