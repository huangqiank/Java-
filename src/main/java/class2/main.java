package class2;

public class main {
    public static void main(String[] args) {
        Player a = new Player("库里");
        System.out.println(a.getName());
        a.shootBall();
        a.setName("詹姆斯");
        System.out.println("改名后");
        a.shootBall();
        System.out.println("a.showVersion");
        a.showVersion();
        System.out.println("Player.showVersion");
        Player.showVersion();
        a.setVersion();
        System.out.println("改version后");
        System.out.println("a.showVersion");
        a.showVersion();
        System.out.println("Player.showVersion");
        Player.showVersion();
    }
}