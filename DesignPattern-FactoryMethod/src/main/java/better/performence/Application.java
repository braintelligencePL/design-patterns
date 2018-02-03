package better.performence;


import better.performence.factory.ComputerType;
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
        typeMap.put("PC", ComputerType.PC);
        typeMap.put("SERVER", ComputerType.SERVER);
    }

    public static void main(String[] args) {

        PerformenceChecker.startTime();
        String result = better.performence.factory.ComputerType.PC.getComputer().toString();
        PerformenceChecker.endTimeAndPrintResult();
    }
}
