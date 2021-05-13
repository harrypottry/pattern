package com.test.principle.carp.correct;

public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL 数据库连接";
    }
}
