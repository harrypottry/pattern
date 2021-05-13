package com.test.principle.ocp;

public class JavaCourse implements ICourse{
    private final Integer Id;
    private final String name;
    private final Double price;
    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }
    public Integer getId() {
        return this.Id;
    }
    public String getName() {
        return this.name;
    }
    public Double getPrice() {
        return this.price;
    }
}
