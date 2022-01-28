public class SQLServerDb implements Db {
    @Override
    public void add() {
        System.out.println("SQL Server add...");
    }

    @Override
    public void delete() {
        System.out.println("SQL Server remove...");
    }
}
