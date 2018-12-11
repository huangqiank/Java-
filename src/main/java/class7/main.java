package class7;

public class main {
    //finally结尾都会运行
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4;
            System.out.println("开始");
            System.out.println(b / a);
        } catch (Exception e) {
            System.out.println("错误");
            System.out.println(e.toString());
        } finally {
            System.out.println("结束");
        }
    }
}