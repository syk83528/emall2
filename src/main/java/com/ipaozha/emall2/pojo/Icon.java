package com.ipaozha.emall2.pojo;

import java.util.Date;

public class Icon {
    private Integer id;

    private String icon;

    private Date createTime;

    private Date updateTime;

    private Integer categoryId;

    public Icon(Integer id, String icon, Date createTime, Date updateTime, Integer categoryId) {
        this.id = id;
        this.icon = icon;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.categoryId = categoryId;
    }

    public Icon() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}