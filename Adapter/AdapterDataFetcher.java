public class AdapterDataFetcher implements DataFetcher {
    private Database db;

    public AdapterDataFetcher(Database db) {
        this.db = db;
    }

    @Override
    public String fetchData() {
        return this.db.fetchDataFromDatabase();
    }
}