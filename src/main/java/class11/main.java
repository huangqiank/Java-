package class11;
//lambda表达式
public class main {
    interface IDatabase{
        void update();
    }

    public static void main(String[] args) {
        //线上类
        class Mysql implements IDatabase{
            @Override
            public void update() {
                System.out.println("更新完成sql");
            }
        }
        IDatabase mysql = new Mysql();
        mysql.update();

        //匿名类
        IDatabase db = new IDatabase(){
            @Override
            public void update() {
                System.out.println("更新完成db");
            }
        };
        db.update();

        //lambda式 ()->{}传参数,方法
        IDatabase blog = ()-> {
            System.out.println("更新博客");
        };
        blog.update();

    }
}