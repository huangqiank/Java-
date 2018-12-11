package class13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//lambda表达式foreach
public class main {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("usa", "美国");
        stringMap.put("chn", "中国");
        stringMap.put("jpn", "日本");
        for (Map.Entry<String, String> item : stringMap.entrySet()) {
            System.out.println(item.getKey() + item.getValue());
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        stringMap.forEach((key, value) -> {
            System.out.println(key + value);
        });
        list.forEach(i -> {
            i += 1;
            System.out.println(i);
        });
        list.forEach(o -> {
            System.out.println(o);
        });

    }
}