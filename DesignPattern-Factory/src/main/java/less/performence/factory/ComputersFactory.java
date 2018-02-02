package less.performence.factory;

import less.performence.model.Computer;
import less.performence.model.PC;
import less.performence.model.Server;

public class ComputersFactory {

    public static Computer getComputer(String type) {
        Computer computer = null;

        if( type.equals("pc"))
            computer = new PC("100GB", "8GB", "2GHz");
        else if( type.equals("server"))
            computer = new Server("500GB", "32GB", "3GHz");

        return computer;
    }

}
