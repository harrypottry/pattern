package com.test.pattern.adapter.loginadapter.v2.adapters;

import com.test.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by zhangsan on 2021/5/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
