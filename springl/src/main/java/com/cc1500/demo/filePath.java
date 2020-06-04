package com.cc1500.demo;

import java.io.File;

public class filePath {
    public static void main(String[] args) {
        main11( "D:\\myown\\");
    }
    public static void main11(String path) {

        File file=new File(path);
        File[] tempList = file.listFiles();
        System.out.println("该目录下对象抄个数："+tempList.length);

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文  件："+tempList[i]);
            }
            if (tempList[i].isDirectory()) {
                System.out.println(tempList[i]);
                main11(tempList[i].toString());
            }
        }
    }
}
