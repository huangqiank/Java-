package class12;

import java.util.function.BiFunction;
import java.util.function.Function;

//lambda 表达式函数形接口
//Function<T,R>,T:参数类型,R：返回值类型
//function<T,T,R>,T:参数类型,R：返回值类型
public class main {
    public static void main(String[] args) {
        Function<Integer,Integer> mult = (i) ->{
            return i*2;
        };
        System.out.println(mult.apply(100));
        BiFunction<Integer,Integer,Integer> add = (i,j) ->{
            return i+j;
        };
        System.out.println(add.apply(10,10));
        BiFunction<Integer,Integer,Integer> sub = (i,j) ->{
            return i-j;
        };
        System.out.println(sub.apply(10,2));
    }

}