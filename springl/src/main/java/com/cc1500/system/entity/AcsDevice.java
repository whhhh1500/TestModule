package com.cc1500.system.entity;
import java.util.Date;
import java.io.Serializable;
/**
 * (AcsDevice)实体类
 *
 * @author makejava
 * @since 2020-05-10 21:36:55
 */
public class AcsDevice implements Serializable {
    private static final long serialVersionUID = 775102501406288984L;
    //门禁设备配置id
    private Integer devId;
    //设备登录名
    private String devUsername;
    //设备登录密码
    private String devPassword;
    //设备端口号
    private Integer devPort;
    //设备ip
    private String devIp;
    //机器名
    private String devName;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //1 正常，2离线
    private String devState;


    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getDevUsername() {
        return devUsername;
    }

    public void setDevUsername(String devUsername) {
        this.devUsername = devUsername;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public Integer getDevPort() {
        return devPort;
    }

    public void setDevPort(Integer devPort) {
        this.devPort = devPort;
    }

    public String getDevIp() {
        return devIp;
    }

    public void setDevIp(String devIp) {
        this.devIp = devIp;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
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

    public String getDevState() {
        return devState;
    }

    public void setDevState(String devState) {
        this.devState = devState;
    }

}