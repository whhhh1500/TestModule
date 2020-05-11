package com.cc1500.framework.aspectj.lang.enums;

/**
 * <h3>AspectDemo</h3>
 * <p>操作类型</p>
 * @author : zhang.bw
 * @date : 2020-04-16 14:58
 **/
public enum OperationType {
    /**
     * 操作类型
     */
    UNKNOWN("unknown"),
    DELETE("delete"),
    SELECT("select"),
    UPDATE("update"),
    INSERT("insert");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OperationType(String s) {
        this.value = s;
    }
}