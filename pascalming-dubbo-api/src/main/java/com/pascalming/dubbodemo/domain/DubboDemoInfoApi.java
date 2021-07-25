package com.pascalming.dubbodemo.domain;

/**
 * 接口类型定义，必须可以序列化
 * @author yuming
 */

public class DubboDemoInfoApi implements java.io.Serializable{
    public String info;
    public String ts;
    public Integer count;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DubboDemoInfoApi{" +
                "info='" + info + '\'' +
                ", ts='" + ts + '\'' +
                ", count=" + count +
                '}';
    }
}
