package com.joker.oj.controller;

import com.joker.oj.common.BaseResponse;
import com.joker.oj.common.ErrorCode;
import com.joker.oj.common.ResultUtils;
import com.joker.oj.exception.BusinessException;
import com.joker.oj.model.dto.postthumb.PostThumbAddRequest;
import com.joker.oj.model.entity.User;
import com.joker.oj.service.PostThumbService;
import com.joker.oj.service.UserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 帖子点赞接口
 *
 * @author <a href="https://github.com/lijoker">程序员鱼皮</a>
 * @from <a href="https://joker.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/post_thumb")
@Slf4j
@CrossOrigin
public class PostThumbController {

    @Resource
    private PostThumbService postThumbService;

    @Resource
    private UserService userService;

    /**
     * 点赞 / 取消点赞
     *
     * @param postThumbAddRequest
     * @param request
     * @return resultNum 本次点赞变化数
     */
    @PostMapping("/")
    public BaseResponse<Integer> doThumb(@RequestBody PostThumbAddRequest postThumbAddRequest,
            HttpServletRequest request) {
        if (postThumbAddRequest == null || postThumbAddRequest.getPostId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 登录才能点赞
        final User loginUser = userService.getLoginUser(request);
        long postId = postThumbAddRequest.getPostId();
        int result = postThumbService.doPostThumb(postId, loginUser);
        return ResultUtils.success(result);
    }

}
