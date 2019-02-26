package class17;

public class Score {
    private String name;
    private String score1;

    public Score(String name, String score1) {
        this.name = name;
        this.score1 = score1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setScore1(String score) {
        this.score1 = score;
    }

    public String getScore1() {
        return this.score1;
    }

}