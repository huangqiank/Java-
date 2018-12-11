package class4;

public class Oracle implements IDatabase {
    @Override
    public void connected() {
        System.out.println(this.getClass().toString() + "连接 ...");
    }

    @Override
    public void close() {
        System.out.println(this.getClass().toString() + "关闭 ...");
    }
}