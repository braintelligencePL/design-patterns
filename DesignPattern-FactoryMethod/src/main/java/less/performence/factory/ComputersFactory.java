package less.performence.factory;

import less.performence.model.Computer;
import less.performence.model.PC;
import less.performence.model.Server;

public class ComputersFactory {

    public enum ComputerType {
        PC, SERVER
    }

    public static Computer getComputer(ComputerType type) {

        switch (type)
        {
            case PC:
                return new PC("1GB", "8GB", "2Ghz");
            case SERVER:
                return new Server("10GB", "32GB", "4Ghz");

        }
        throw new IllegalArgumentException("Given computer type doesn't exist");
    }
}