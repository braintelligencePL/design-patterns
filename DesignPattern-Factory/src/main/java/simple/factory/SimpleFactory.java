package simple.factory;

import simple.factory.computer.*;

public class SimpleFactory {

    public Computer createComputer(ComputerType computerType) {

        switch (computerType) {
            case PC:
                return new PC();
            case MAC:
                return new Mac();
            case SERVER:
                return new Server();
            default:
                    return null;
        }
    }
}
