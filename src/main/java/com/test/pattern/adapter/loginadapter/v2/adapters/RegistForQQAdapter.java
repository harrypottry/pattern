package com.test.pattern.adapter.loginadapter.v2.adapters;

import com.test.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by zhangsan on 2021/5/16.
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
