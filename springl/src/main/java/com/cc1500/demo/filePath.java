package com.cc1500.demo;

import java.io.File;

public class filePath {
    public static void main(String[] args) {
        //main11( "D:\\myown\\");
        main12("E:/微服务/JavaEE项目“互联网电子购物商城”（可做毕设_实战进阶项目）");
    }


    public static void main12(String path) {

        File file = new File(path);
        File[] list = file.listFiles();

        // 如果目录下文件存在
        if (file.exists() && file.isDirectory())
        {
            for (int i = 0; i < list.length; i++)
            {
                //取文件名子存入name中
                String name = list[i].getName();
                name =name.substring(43);
                File dest = new File(path + "/" + name);
                list[i].renameTo(dest);
               System.out.println(dest.getName());
            }
        }
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
