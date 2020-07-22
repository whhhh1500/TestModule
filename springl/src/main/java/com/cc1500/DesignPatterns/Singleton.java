package com.cc1500.DesignPatterns;


//饿汉式写法
public class Singleton{
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}

//静态内部类
  class Singleton1 {
    private static class SingletonHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
    private Singleton1 (){}
    public static final Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}