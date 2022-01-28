public class Main {

    public static void main(String[] args) {
        Db db = DbManager.getInstance();

        db.add();
        db.delete();
    }
}
