public class Memory {
    private char[] memoryData;

    public Memory(int size) {
        memoryData = new char[size];
    }

    public void load(long position, char[] data) {
        System.out.println("Memory: Loading data to position " + position);
        System.arraycopy(data, 0, memoryData, (int) position, data.length);
    }

    public void printMemoryContents() {
        System.out.println("Memory Contents:");
        for (int i = 0; i < memoryData.length; i++) {
            System.out.println("Address " + i + ": " + memoryData[i]);
        }
    }
}
