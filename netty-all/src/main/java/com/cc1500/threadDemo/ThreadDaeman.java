package com.cc1500.threadDemo;

import java.util.concurrent.TimeUnit;

public class ThreadDaeman {
    public static void main(String[] args) {

        Thread t = new Thread(ThreadDaeman::run, "t1");
        t.setDaemon(true);
        t.start();
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("for:" + i);
                TimeUnit.SECONDS.sleep(1);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("0");
    }

    private static void run() {

        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("            run:" + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}