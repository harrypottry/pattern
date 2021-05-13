package com.test.pattern.adapter.loginadapter.v1;

import com.test.pattern.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 * Created by zhangsan on 2021/5/16.
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("zhangsan","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
