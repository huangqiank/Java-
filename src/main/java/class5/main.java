package class5;

import java.util.ArrayList;
import java.util.List;

//list<>列表,是集合  ArrayList<>范型加上数组的属性,有前后顺序的list
//集合和数组类似的数据结构,但集合更容易操作,也支持更多算法
//范型可以让集合更加高效,支持更多数据类型
//list，ArrayList是集合,<>是范型
public class main {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        runs(a);
        runi(b);
    }
    public static void runs(List<String> list){
        list.add("1");
        list.add("2");
        for (String i : list){
            System.out.println(i);
        }
    };
    public static void runi(List<Integer> list){
        list.add(1);
        list.add(2);
        for (Integer i : list){
            System.out.println(i);
        }
    };

}