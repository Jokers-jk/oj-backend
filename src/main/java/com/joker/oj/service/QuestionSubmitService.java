package com.joker.oj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joker.oj.model.dto.question.QuestionQueryRequest;
import com.joker.oj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.joker.oj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.joker.oj.model.entity.Question;
import com.joker.oj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.joker.oj.model.entity.User;
import com.joker.oj.model.vo.QuestionSubmitVO;
import com.joker.oj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 10621
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-03-01 12:35:12
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);



    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param request
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param request
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);




}
