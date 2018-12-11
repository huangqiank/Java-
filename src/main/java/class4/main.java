package class4;

public class main {
    public static void main(String[] args) {
        System.out.println("Oracle");
        run(new Oracle());
        System.out.println("Mysql");
        run(new Mysql());
    }
    //run函数接受的是接口的类型
    private static void run(IDatabase db){
        db.connected();
        db.close();
    }

}