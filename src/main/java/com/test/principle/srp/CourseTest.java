package com.test.principle.srp;

public class CourseTest {
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("Ö±²¥¿Î");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("Â¼²¥¿Î");
    }
}

