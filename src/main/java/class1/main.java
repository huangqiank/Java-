package class1;

public class main {
    public static void main(String[] args) {
        Player a = new Player("我的");
        a.shootBall2();
        System.out.println(a.getName());
        a.setName("你的");
        System.out.println(a.getName());
    }
}