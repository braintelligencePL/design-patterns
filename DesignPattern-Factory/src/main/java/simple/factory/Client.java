package simple.factory;

import simple.factory.computer.ComputerType;

public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createComputer(ComputerType.PC);
    }
}
