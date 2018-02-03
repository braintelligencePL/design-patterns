package less.performence;

import less.performence.factory.ComputersFactory;
import less.performence.model.Computer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import performence.PerformenceChecker;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        PerformenceChecker.startTime();
        Computer result = ComputersFactory.getComputer(ComputersFactory.ComputerType.PC);
        PerformenceChecker.endTimeAndPrintResult();

    }
}
