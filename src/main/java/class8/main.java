package class8;

import class8.entity.Player;
import class8.util.MyUtil;
//包的管理
public class main {
    public static void main(String[] args) {
        int a = MyUtil.add(10,2);
        System.out.println(a);
        Player s = new Player("库里");
        s.shootBall2();
    }
}