package better.performence;


import better.performence.factory.ComputerFactory;
import better.performence.model.Computer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import performence.PerformenceChecker;

import java.util.HashMap;
import java.util.Map;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    static Map typeMap = new HashMap();

    static
    {
        typeMap.put("sample_1.sample_2.PC", ComputerFactory.PC);
        typeMap.put("SERVER", ComputerFactory.SERVER);
    }

    public static void main(String[] args) {

        PerformenceChecker.startTime();
        Computer result = ComputerFactory.PC.getComputer();
        PerformenceChecker.endTimeAndPrintResult();
    }
}
