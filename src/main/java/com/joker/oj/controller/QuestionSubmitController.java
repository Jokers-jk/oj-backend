package com.joker.oj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joker.oj.annotation.AuthCheck;
import com.joker.oj.common.BaseResponse;
import com.joker.oj.common.ErrorCode;
import com.joker.oj.common.ResultUtils;
import com.joker.oj.constant.UserConstant;
import com.joker.oj.exception.BusinessException;
import com.joker.oj.model.dto.question.QuestionQueryRequest;
import com.joker.oj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.joker.oj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.joker.oj.model.entity.Question;
import com.joker.oj.model.entity.QuestionSubmit;
import com.joker.oj.model.entity.User;
import com.joker.oj.model.vo.QuestionSubmitVO;
import com.joker.oj.service.QuestionSubmitService;
import com.joker.oj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 */
@RestController
@RequestMapping("/question_submit")
@Slf4j
@CrossOrigin
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;



}
