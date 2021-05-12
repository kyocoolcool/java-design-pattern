package com.kyocoolcool.prototype.example1;

import java.util.Date;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 5:58 PM
 */
public class Video implements Cloneable{

    private String name;
    private Date createTime;

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
