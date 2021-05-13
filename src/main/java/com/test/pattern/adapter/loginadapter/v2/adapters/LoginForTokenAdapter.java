package com.test.pattern.adapter.loginadapter.v2.adapters;

import com.test.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by zhangsan.
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
