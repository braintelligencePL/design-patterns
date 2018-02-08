package FactoryMethod;

import FactoryMethod.cpu.Cpu;
import FactoryMethod.cpu.CpuType;
import FactoryMethod.disk.Disk;
import FactoryMethod.disk.DiskType;
import FactoryMethod.ram.Ram;
import FactoryMethod.ram.RamType;

public interface Computer {
    Cpu makeCPU(CpuType type);
    Disk makeDISK(DiskType diskType);
    Ram makeRAM(RamType type);
}
