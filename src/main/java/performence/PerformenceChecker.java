package performence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformenceChecker {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformenceChecker.class);
    private static long startTime;

    public static void startTime() {
        startTime = System.nanoTime();
    }

    public static void endTimeAndPrintResult() {
        long endTime = System.nanoTime();
        LOGGER.info(String.valueOf("Time Difference:: " +  (endTime-startTime) + "ms"));
    }

}
