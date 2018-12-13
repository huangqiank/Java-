package practice;

public class Jointest implements Runnable {
    int a = 1;
    boolean b = true;

    @Override
    public void run() {
        while (b) {
            for (int i = 0; i < 10; i++) {
                a += 1;
            }
        }
    }
}