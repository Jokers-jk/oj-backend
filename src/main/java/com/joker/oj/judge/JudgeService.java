package com.joker.oj.judge;

import com.joker.oj.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
