package class16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//timer,设置间隔时间等
//timertask,每个一定时间做的任务
//每隔三秒开始执行,做定时任务

public class main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("[HH:mm:ss]");
        class MyTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println(format.format(new Date()) + "run");
            }
        }
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(), 1000, 3000);
    }
}