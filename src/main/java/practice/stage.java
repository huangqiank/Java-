package practice;

public class stage extends Thread {
    public void run() {
        Jointest test1 = new Jointest();
        Thread t1 = new Thread(test1, "test");
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test1.b = false;
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        new stage().start();
    }


}
