package xiancheng.class1;

public class Actor extends Thread {
    public void run() {
        int count = 0;
        boolean keepRunning = true;
        System.out.println(getName() + "是一个演员");
        while (keepRunning) {
            System.out.println(getName() + "开始演出" + (++count));
            if (count == 100) {
                keepRunning = false;
            }
            if (count % 10 == 0) {
                try {
                    Actor.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(getName() + "演出结束");
    }

    public static void main(String[] args) {
        Thread actor = new Actor();
        Thread actress = new Thread(new Actress(),"Ms runnable");
        actor.setName("Mr thread");
        actor.start();
        actress.start();
    }
}