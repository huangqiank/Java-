package xiancheng.class2;

public class ArmyRunnable implements Runnable{
    //volatile 保证线程正确读取其他线程写入的值
   volatile boolean keepRunnig = true;
    @Override
    public void run(){
        while (keepRunnig){
            for (int i= 0 ;i<1000;i++){
                System.out.println(Thread.currentThread().getName()+i+"次进攻对方");
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束战争");
    }
}