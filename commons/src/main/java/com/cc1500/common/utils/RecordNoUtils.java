package com.cc1500.common.utils;

/**
 * @author zhy
 * @title: RecordNoUtils
 * @projectName pay
 * @description: TODO
 * @date 2019/7/17 13:59
 */
public class RecordNoUtils {
    /**
     * @param workerId 工作ID (0~31)
     * @param datacenterId 数据中心ID (0~31)
     */
    private static UniqueOrderGenerate idWorker = new UniqueOrderGenerate(0, 0);
    public static RecordNoUtils getInstance() {
        return new RecordNoUtils();
    }

    public String get(String mark) {
        return  mark+idWorker.nextId();
    }


}
