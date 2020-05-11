package com.cc1500.common.enums;

public enum VideoRatio {
    LOW(1, "1920x1080"), MIDDLE(2, "1280x720"), HIGH(3, "720x480"),LOWER(4,"480x360");

    private final int code;
    private final String value;

    VideoRatio(int code, String value)
    {
        this.code = code;
        this.value = value;
    }

    public int getCode()
    {
        return code;
    }

    public String getValue()
    {
        return value;
    }
}
