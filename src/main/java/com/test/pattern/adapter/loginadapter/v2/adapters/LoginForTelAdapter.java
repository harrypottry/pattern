package com.test.pattern.adapter.loginadapter.v2.adapters;

import com.test.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by zhangsan.
 */
public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
