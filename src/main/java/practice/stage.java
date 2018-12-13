package practice;

public class stage extends Thread{
    Jointest test = new Jointest();
    Thread t1 = new Thread(test);
    t1.start();
    try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    public static void main(String[] args) {
        new stage().start();
    }



}