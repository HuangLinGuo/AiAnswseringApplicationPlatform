package com.hlg.aap.model.vo;

import cn.hutool.json.JSONUtil;
import com.hlg.aap.model.entity.ScoringResult;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 评分结果视图
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@Data
public class ScoringResultVO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 结果名称，如物流师
     */
    private String resultName;

    /**
     * 结果描述
     */
    private String resultDesc;

    /**
     * 结果图片
     */
    private String resultPicture;

    /**
     * 结果属性集合 JSON，如 [I,S,T,J]
     */
    private List<String> resultProp;

    /**
     * 结果得分范围，如 80，表示 80及以上的分数命中此结果
     */
    private Integer resultScoreRange;

    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    /**
     * 创建用户信息
     */
    private UserVO user;

    /**
     * 封装类转对象
     *
     * @param scoringresultVO
     * @return
     */
    public static ScoringResult voToObj(ScoringResultVO scoringresultVO) {
        if (scoringresultVO == null) {
            return null;
        }
        ScoringResult scoringresult = new ScoringResult();
        BeanUtils.copyProperties(scoringresultVO, scoringresult);
        scoringresult.setResultProp(JSONUtil.toJsonStr(scoringresultVO.getResultProp()));
        return scoringresult;
    }

    /**
     * 对象转封装类
     *
     * @param scoringresult
     * @return
     */
    public static ScoringResultVO objToVo(ScoringResult scoringresult) {
        if (scoringresult == null) {
            return null;
        }
        ScoringResultVO scoringresultVO = new ScoringResultVO();
        BeanUtils.copyProperties(scoringresult, scoringresultVO);
        scoringresultVO.setResultProp(JSONUtil.toList(scoringresult.getResultProp(), String.class));
        return scoringresultVO;
    }
}
