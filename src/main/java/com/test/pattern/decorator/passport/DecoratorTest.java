package com.test.pattern.decorator.passport;

import com.test.pattern.decorator.passport.old.SigninService;
import com.test.pattern.decorator.passport.upgrade.ISiginForThirdService;
import com.test.pattern.decorator.passport.upgrade.SiginForThirdService;
import org.springframework.cache.transaction.TransactionAwareCacheDecorator;
import org.springframework.http.server.reactive.HttpHeadResponseDecorator;

import java.io.BufferedReader;

/**
 * Created by zhangsan on 2021/5/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
