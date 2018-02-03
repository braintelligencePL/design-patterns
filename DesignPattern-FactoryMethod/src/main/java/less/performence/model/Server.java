package less.performence.model;

public class Server implements Computer{

    private String ssd;
    private String ram;
    private String cpu;

    public Server(String ssd, String ram, String cpu) {
        this.ssd = ssd;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getSSD() {
        return this.ssd;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ssd='" + ssd + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}

