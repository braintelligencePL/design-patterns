package less.performence.model;

public class PC implements Computer {

    private String dataStorage;
    private String ram;
    private String cpu;

    public PC(String dataStorage, String ram, String cpu) {
        this.dataStorage = dataStorage;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getDataStorage() {
        return this.dataStorage;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}
