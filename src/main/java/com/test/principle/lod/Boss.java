package com.test.principle.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * 现在来设计一个权限系统，Boss 需要查看目前发布到线上的课程数量。这时候，Boss
 *
 * 要找到 TeamLeader 去进行统计，TeamLeader 再把统计结果告诉 Boss
 */
public class Boss {

    //boss 不需要 关心 course，只需要关心  TeamLeader
    public void commandCheckNumber(TeamLeader teamLeader){ //模拟 Boss 一页一页往下翻页，TeamLeader 实时统计
         List<Course> courseList = new ArrayList<Course>();
         for (int i= 0; i < 20 ;i ++){
            courseList.add(new Course());
         }
        teamLeader.checkNumberOfCourses(courseList);
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
