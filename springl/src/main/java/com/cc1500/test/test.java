package com.cc1500.test;

import lombok.SneakyThrows;

import java.time.LocalDate;
import java.time.LocalTime;

public class test {
    public static void main(String[] args) {
        Thread t1=    new ThreadTest();
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isInterrupted());
        t1.interrupt();
       // System.out.println(t1.isInterrupted());
    }

static class ThreadTest extends  Thread{

        @Override
        public void run(){
            boolean flg=true;
            while(flg){
               System.out.println(" Interrupted   "+flg);
                if(currentThread().isInterrupted())
                   flg=false;
               

            }
        }

}
}
