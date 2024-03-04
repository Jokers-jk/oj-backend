package com.joker.oj.judge.codesandbox;

import com.joker.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.joker.oj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
