package class4;

public interface IDatabase {
    //共有抽象方法，必须被实现的方法
    void connected();
    void close();
}