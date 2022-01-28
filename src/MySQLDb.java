public class MySQLDb implements Db {
    @Override
    public void add() {
        System.out.println("Mysql add...");
    }

    @Override
    public void delete() {
        System.out.println("Mysql remove...");
    }
}
