package FactoryMethod.better.performence;


import FactoryMethod.better.performence.factory.ComputerFactory;
import FactoryMethod.better.performence.model.Computer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    static Map typeMap = new HashMap();

    static
    {
        typeMap.put("PC", ComputerFactory.PC);
        typeMap.put("SERVER", ComputerFactory.SERVER);
    }

    public static void main(String[] args) {

        long startTIme = System.nanoTime();
        Computer result = ComputerFactory.PC.getComputer();
        LOGGER.info(String.valueOf(System.nanoTime() - startTIme));
    }
}
