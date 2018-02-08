package FactoryMethod.better.performence.factory;

import FactoryMethod.better.performence.model.Computer;
import FactoryMethod.better.performence.model.PC;
import FactoryMethod.better.performence.model.Server;

public enum ComputerFactory
{
    PC {
        @Override
        public Computer getComputer() {
            return new PC("100GB", "8GB", "2GHz");
        }
    },
    SERVER {
        @Override
        public Computer getComputer() {
            return new Server("500GB", "32GB", "3GHz");
        }
    };

    private String type;

    ComputerFactory() {}

    public abstract Computer getComputer();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ComputerFactory{" +
                "type='" + type + '\'' +
                '}';
    }
}