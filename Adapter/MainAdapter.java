public class MainAdapter {
    public static void main(String[] args) {
        Database Db = new Database();

        // Normitoteutus
        DataFetcher normiFetcher = new NormiDataFetcher(Db);
        System.out.println("Normitoteutus: " + normiFetcher.fetchData());

        // Adapteritoteutus
        DataFetcher adapterFetcher = new AdapterDataFetcher(Db);
        System.out.println("Adapteritoteutus: " + adapterFetcher.fetchData());
    }
}