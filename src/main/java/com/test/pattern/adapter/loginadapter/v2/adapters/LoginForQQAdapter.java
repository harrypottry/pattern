package com.test.pattern.adapter.loginadapter.v2.adapters;

import com.test.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by zhangsan on 2021/5/16.
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
