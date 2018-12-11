package class6;

public class main {
    //静态的变量可以直接调用
    private static String version = "1.0";
    //动态的没法直接调用,需要先实例化
    String s = "2";

    public static void main(String[] args) {
        int a, b, c;
        int d = 10, e = 20;
        byte g = 127;
        double pi = 3.14259;
        char chr = 'a';
        System.out.println("version :" + version);
        System.out.println("s :" + new main().s);
        System.out.println("pi :" + pi);
        System.out.println("chr :" + chr);
        System.out.println("g :" + g);
    }


}