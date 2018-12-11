package class8.entity;

public class Player {
    private String name;
    //构造方法,构造器,名字和类名一样,无返回值
    public Player(String name) {
        this.name = name;
    }

    public void shootBall2() {
        System.out.println(name + "2分");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
