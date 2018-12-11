package class10;
//匿名类和线上类


public class main {
    interface IDatabase {
        void connect();

        void close();
    }

    public static void main(String[] args) {
        //线上类
        class Oracle implements IDatabase {
            @Override
            public void connect() {
                System.out.println("链接oracle");
            }

            @Override
            public void close() {
                System.out.println("断开oracle");
            }
        }
        IDatabase oracle = new Oracle();
        oracle.connect();
        oracle.close();
        //匿名类
        IDatabase mysql = new IDatabase() {
            @Override
            public void connect() {
                System.out.println("链接sql");
            }
            @Override
            public void close() {
                System.out.println("断开sql");

            }
        };
        mysql.connect();
        mysql.close();
    }
}