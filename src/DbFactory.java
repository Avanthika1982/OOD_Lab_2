public class DbFactory {
    public Db getDb(String dbName) {
        if(dbName == "SQL Server") {
            return new SQLServerDb();
        } else if (dbName == "Mysql") {
            return new MySQLDb();
        }
        return null;
    }
}
