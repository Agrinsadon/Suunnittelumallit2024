public class ComputerFacade {
    private static final long kBootAddress = 5;
    private static final long kBootSector = 5;
    private static final int kSectorSize = 550;

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(int memorySize) {
        cpu = new CPU();
        memory = new Memory(memorySize);
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(kBootSector, kSectorSize);
        memory.load(kBootAddress, bootData);
        cpu.jump(kBootAddress);
        cpu.execute();
    }

    public void printMemoryContents() {
        memory.printMemoryContents();
    }
}
