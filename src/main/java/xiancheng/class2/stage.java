package xiancheng.class2;

public class stage extends Thread {
    public void run() {
        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();

        //使用runnable创建线程
        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "隋军");
        Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民起义军");
        //启动线程
        armyOfRevolt.start();
        armyOfSuiDynasty.start();
        //舞台线程休眠
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        armyTaskOfRevolt.keepRunnig = false;
        armyTaskOfSuiDynasty.keepRunnig = false;
        try {
            armyOfRevolt.join();
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        new stage().start();
    }
}