package com.cc1500.test.mytask;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Object> {


    @Override
    public Object call() throws Exception {
       Integer in = 0;
        while (in<5){
            Thread.sleep(1000);
            System.out.println("task : "+in++);
        }

        return in;
    }
}
