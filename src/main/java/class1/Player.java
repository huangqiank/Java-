package class1;

public class Player {
    private String name;
    private Double height;
    //构造方法,构造器,名字和类名一样,无返回值
    public Player(String name,Double height) {
        this.name = name;
        this.height = height;
    }

    public void shootBall() {
        System.out.println(name + "2分");
    }

    public String getName() {
        return this.name;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

}
