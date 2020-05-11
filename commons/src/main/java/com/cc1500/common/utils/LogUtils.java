package com.cc1500.common.utils;

/**
 * 处理并记录日志文件
 * 
 * @author cc1500
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
