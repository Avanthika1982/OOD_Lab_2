// Singleton class
public class DbManager {
    private static DbManager dbManager = null;
    private static Db db = null;

    private DbManager() {
        // Establish connection with db
        db = new DbFactory().getDb("Mysql");
    }

    public static Db getInstance() {
        if(dbManager == null) {
            dbManager = new DbManager();
        }
        return db;
    }


}
