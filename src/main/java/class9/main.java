package class9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//日期类型
//Date
//Calendar

public class main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());
//SimpleDateFormat定义的日期的正则,MM十月份,mm是分钟，小时也要大写
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(format.format(date));

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toString());
        int year = calendar.get(Calendar.YEAR);
//月份从0开始算得,0是1月
        int month = calendar.get(Calendar.MONTH)+1;
        int cdate = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + cdate + "日" + hour + "小时" + minute + "分钟" + second + "秒");

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(2017, 10, 27,15,10,11);
        calendar2.set(2018, 5, 20);
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
//set的地方月份从0开始算得,0是1月
        if (calendar1.before(calendar2)) {
            System.out.println(calendar1.getTime() + "在" + calendar2.getTime().toString() + "前面");
        }
    }
}