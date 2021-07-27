package com.pascalming.dubbodemo.domain;

/**
 * 接口类型定义，必须可以序列化
 * @author yuming
 */

public class DubboDemoMysql implements java.io.Serializable{
    public String host;
    public String db;
    public Integer user;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DubboDemoMysql{" +
                "host='" + host + '\'' +
                ", db='" + db + '\'' +
                ", user=" + user +
                '}';
    }
}
