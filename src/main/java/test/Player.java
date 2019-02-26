package test;

public class Player {
    private String name;
    private double height;
    public Player(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public void shootBall2() {
        System.out.println(name + " socre2");
    }
    public String getName() {
        return this.name;
    }
    public double getHeight() {
        return this.height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}