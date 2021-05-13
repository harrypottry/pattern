package com.test.pattern.delegate.simple;

/**
 * Created by zhangsan.
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}

