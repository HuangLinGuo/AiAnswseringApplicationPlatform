package com.hlg.aap.model.dto.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionContentDTO {
    /**
     * 题目描述*/
    private  String title;
    /**
     * 题目选项
     */
    private List<String> options;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Option{
        private String  result;
        private int score;
        private  String value;
        private  String key;
    }

}
