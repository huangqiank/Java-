package class18;

import lombok.*;

@Getter
@Setter
public class Player {
    private String name;
    private Double score;
    private String type;
    //静态字段只能被静态方法调用
    public static String version = "1";
    //静态字段可以不实例化使用

    public Player(String name, Double score,String type) {
        this.name = name;
        this.score = score;
        this.type = type;
    }

}