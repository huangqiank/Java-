package class1;

public class main {
    public static void main(String[] args) {
        Player player = new Player("张三",1.6);
        player.shootBall();
        System.out.println(player.getName());
        player.setName("李四");
        System.out.println(player.getName());
        System.out.println(player.getHeight());
    }
}