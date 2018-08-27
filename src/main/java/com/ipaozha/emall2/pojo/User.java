package com.ipaozha.emall2.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private Date createTime;

    private Date updateTime;

    private String icon;

    public User(Integer id, String name, Integer age, String sex, Date createTime, Date updateTime, String icon) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.icon = icon;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}