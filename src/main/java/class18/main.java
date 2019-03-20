package class18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Player a = new Player("a",1.2,"1");
        Player b = new Player("b",2.3,"1");
        Player c = new Player("c",4.3,"2");
        Player d = new Player("d",5.3,"1");
        List<Player> playerList = new ArrayList<>();
        playerList.add(a);
        playerList.add(b);
        playerList.add(c);
        playerList.add(d);
        List<String> players = playerList.stream().filter(t -> t.getType().equals("1"))
                .sorted(Comparator.comparing(Player::getScore).reversed())
                .map(Player->f(Player)).collect(Collectors.toList());
        players.forEach((k) -> System.out.println(k));
    }
    public static String f(Player t){
        if (t.getName().equals("a")){
            return "a";
        }
        return "a";
    }
}