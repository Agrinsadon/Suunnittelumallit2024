public class HardDrive {
    public char[] read(long lba, int size) {
        System.out.println("Hard Drive: Reading data from LBA " + lba + " with size " + size);
        char[] data = new char[size];
        return data;
    }
}
