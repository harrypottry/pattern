package com.test.pattern.decorator.passport.upgrade;

import com.test.pattern.decorator.passport.old.ISigninService;
import com.test.pattern.decorator.passport.old.ResultMsg;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class SiginForThirdService implements ISiginForThirdService {

    private ISigninService signinService;

    public SiginForThirdService(ISigninService signinService) {
        this.signinService = signinService;
    }

    public ResultMsg regist(String username, String password) {
        return signinService.regist(username,password);
    }

    public ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }

    public ResultMsg loginForQQ(String id) {
        return null;
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
