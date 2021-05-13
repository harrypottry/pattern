package com.test.principle.ocp;

/**
 * 8小时工作制：闭
 * 早来早走，晚来晚走：开
 */
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
}