public class MainFacade {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(1030);
        computer.start();
        computer.printMemoryContents();
    }
}
