public class NormiDataFetcher implements DataFetcher {
    private Database db;

    public NormiDataFetcher(Database db) {
        this.db = db;
    }

    @Override
    public String fetchData() {
        return this.db.fetchDataFromDatabase();
    }
}