package class2;

public class Player {
    private String name;
    //静态字段只能被静态方法调用
    public static String version = "1";

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void shootBall() {
        System.out.println(this.name + "2分");
    }
    //静态方法不可以调用name这种动态变量
    public static void showVersion() {
        System.out.println(version);
    }

    public static void setVersion() {
        version = "2.0";
    }

}