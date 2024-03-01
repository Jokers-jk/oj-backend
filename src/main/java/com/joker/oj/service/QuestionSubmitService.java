package com.joker.oj.service;

import com.joker.oj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.joker.oj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.joker.oj.model.entity.User;

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
    Long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);



}
