package com.quanmin.model;


import java.io.Serializable;
import java.util.Date;
public class UserReport  implements Serializable{
    private Integer id;

    private Integer userId;

    private String reportUrl;

    private String analyzeUrl;

    private String hraId;

    private String type;

    private Date createTime;

    private Date updateTime;

    private String ext1;

    private String ext2;

    private String ext3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl == null ? null : reportUrl.trim();
    }

    public String getAnalyzeUrl() {
        return analyzeUrl;
    }

    public void setAnalyzeUrl(String analyzeUrl) {
        this.analyzeUrl = analyzeUrl == null ? null : analyzeUrl.trim();
    }

    public String getHraId() {
        return hraId;
    }

    public void setHraId(String hraId) {
        this.hraId = hraId == null ? null : hraId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }
}