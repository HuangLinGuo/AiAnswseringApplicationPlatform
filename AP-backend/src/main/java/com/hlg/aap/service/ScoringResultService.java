package com.hlg.aap.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hlg.aap.model.dto.scoringresult.ScoringResultQueryRequest;
import com.hlg.aap.model.entity.ScoringResult;
import com.hlg.aap.model.vo.ScoringResultVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 评分结果服务
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
public interface ScoringResultService extends IService<ScoringResult> {

    /**
     * 校验数据
     *
     * @param scoringresult
     * @param add 对创建的数据进行校验
     */
    void validScoringResult(ScoringResult scoringresult, boolean add);

    /**
     * 获取查询条件
     *
     * @param scoringresultQueryRequest
     * @return
     */
    QueryWrapper<ScoringResult> getQueryWrapper(ScoringResultQueryRequest scoringresultQueryRequest);
    
    /**
     * 获取评分结果封装
     *
     * @param scoringresult
     * @param request
     * @return
     */
    ScoringResultVO getScoringResultVO(ScoringResult scoringresult, HttpServletRequest request);

    /**
     * 分页获取评分结果封装
     *
     * @param scoringresultPage
     * @param request
     * @return
     */
    Page<ScoringResultVO> getScoringResultVOPage(Page<ScoringResult> scoringresultPage, HttpServletRequest request);
}
