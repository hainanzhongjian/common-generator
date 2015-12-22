package com.puhui.jdqhome.model;

import java.util.Date;

public class ApplyMobile {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 申请编号
     */
    private String applyNo;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 服务密码（MD5加密）
     */
    private String password;

    /**
     * 网站密码（MD5加密）
     */
    private String webPassword;

    /**
     * 状态（0：未验证 1：已验证）
     */
    private Integer status;

    /**
     * 验证错误次数
     */
    private Integer verifyNum;

    /**
     * 验证错误时间
     */
    private Date verifyNumTime;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebPassword() {
        return webPassword;
    }

    public void setWebPassword(String webPassword) {
        this.webPassword = webPassword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVerifyNum() {
        return verifyNum;
    }

    public void setVerifyNum(Integer verifyNum) {
        this.verifyNum = verifyNum;
    }

    public Date getVerifyNumTime() {
        return verifyNumTime;
    }

    public void setVerifyNumTime(Date verifyNumTime) {
        this.verifyNumTime = verifyNumTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
}