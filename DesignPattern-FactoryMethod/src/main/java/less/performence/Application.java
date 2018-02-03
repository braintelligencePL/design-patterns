package less.performence;

import less.performence.factory.ComputersFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import performence.PerformenceChecker;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        PerformenceChecker.startTime();
        String result = ComputersFactory.getComputer(ComputersFactory.ComputerType.PC).toString();
        PerformenceChecker.endTimeAndPrintResult();

    }
}
