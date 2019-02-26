package class17;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        LogVO logVO = new LogVO();
        logVO.setCountry("1");
        logVO.setDesc("2");
        logVO.setNoteId("3");
        logVO.setTitle("4");
        List<Score> a = new ArrayList<>();
        Score b = new Score("1", "2");
        Score c = new Score("3", "4");
        a.add(b);
        a.add(c);
        logVO.setUserId(a);
        System.out.println(logVO);
        System.out.println(JSON.toJSONString(logVO));
        JSON.toJSONString(logVO).getBytes();
    }

    @Data
    private static class LogVO {
        private List<Score> userId;
        private String country;
        private String noteId;
        private String title;
        private String desc;
    }

}