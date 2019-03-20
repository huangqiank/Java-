package Iterator;


import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//list 在remove的时候用iterator ，不可以直接删除。不要用immutable

public class Listremove {
    private static final Set<String> LANG_SET = ImmutableSet.of("华语", "英语", "纯音乐");

    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(1, null, 3, 4, null, 6);
        nums.stream().filter(num -> num != null).forEach(System.out::println);
        List<String> LANG_LIST = new ArrayList<>();
        LANG_LIST.add("华语");
        LANG_LIST.add("英语");
        LANG_LIST.add("轻音乐");
        Iterator<String> a = LANG_LIST.iterator();
        while (a.hasNext()) {
            if ("华语".equals(a.next())) {
                a.remove();
            }
        }
        System.out.println(LANG_LIST);
        LANG_LIST.add("华语");

        for (String name : LANG_LIST) {
            if ("华语".equals(name)) {
                a.remove();
            }
        }
        System.out.println(LANG_LIST);
    }
}