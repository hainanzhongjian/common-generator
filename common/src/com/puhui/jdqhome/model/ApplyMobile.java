package com.puhui.jdqhome.model;

import java.util.Date;

public class ApplyMobile {
    /**
     * ��������
     */
    private Long id;

    /**
     * ������
     */
    private String applyNo;

    /**
     * �ֻ���
     */
    private String mobile;

    /**
     * �������루MD5���ܣ�
     */
    private String password;

    /**
     * ��վ���루MD5���ܣ�
     */
    private String webPassword;

    /**
     * ״̬��0��δ��֤ 1������֤��
     */
    private Integer status;

    /**
     * ��֤�������
     */
    private Integer verifyNum;

    /**
     * ��֤����ʱ��
     */
    private Date verifyNumTime;

    /**
     * �汾��
     */
    private Integer version;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * �޸�ʱ��
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