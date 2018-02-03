package better.performence.factory;

import better.performence.model.Computer;
import better.performence.model.PC;
import better.performence.model.Server;

public enum ComputerType
{
    PC("PC") {
        @Override
        public Computer getComputer() {
            return new PC("100GB", "8GB", "2GHz");
        }
    },
    SERVER("SERVER") {
        @Override
        public Computer getComputer() {
            return new Server("500GB", "32GB", "3GHz");
        }
    };

    private String type;

    ComputerType(String type) {}

    public abstract Computer getComputer();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ComputerType{" +
                "type='" + type + '\'' +
                '}';
    }
}