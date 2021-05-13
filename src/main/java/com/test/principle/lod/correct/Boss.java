package com.test.principle.lod.correct;

/**
 * 观察类图：Course 和 Boss 已经没有关联了
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
