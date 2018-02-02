package less.performence.model;

public class Server implements Computer{

    private String dataStorage;
    private String ram;
    private String cpu;

    public Server(String dataStorage, String ram, String cpu) {
        this.dataStorage = dataStorage;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getDataStorage() {
        return null;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }
}
