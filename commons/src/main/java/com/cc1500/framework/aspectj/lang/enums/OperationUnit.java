package com.cc1500.framework.aspectj.lang.enums;


/**
 * <h3>AspectDemo</h3>
 * <p>被操作的单元</p>
 * @author : zhang.bw
 * @date : 2020-04-16 15:00
 **/
public enum OperationUnit {

    /**
     * 被操作的单元
     */
    UNKNOWN("unknown"),
    USER("user"),
    EMPLOYEE("employee"),
    Redis("redis");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OperationUnit(String value) {
        this.value = value;
    }
}