package xiancheng;

public class Actress implements Runnable {
    @Override
    public void run() {
        int count = 0;
        System.out.println(Thread.currentThread().getName() + "我是一个演员");
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(Thread.currentThread().getName() + "开始演出" + (++count));
            if (count == 100) {
                keepRunning = false;
            }
            if (count % 10 == 0) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + "演出结束");
    }
}