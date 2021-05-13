package com.test.principle.ocp;

/**
 * 现在我们要给 Java 课程做活动，价格优惠。
 * 如果修改 JavaCourse 中的 getPrice() 方法，则会存在一定的风险，可能影响其他地方的调用结果。
 * 我们如何在不修改原有代 码前提前下，实现价格优惠这个功能呢？
 *
 *
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginPrice(){
        return super.getPrice();
    }
    public Double getPrice(){
        return super.getPrice() * 0.61;
    }
}
