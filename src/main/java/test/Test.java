package test;

public class Test {
    public static void main(String[] args) {
        Player a = new Player("Mine", 173.5);
        a.shootBall2();
        System.out.println(a.getName());
        a.setName("Yours");
        System.out.println(a.getName());
        System.out.println(a.getHeight());
    }
}