package com.cc1500.demo.test.mytask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyTask myTask = new MyTask();
        FutureTask futureTask = new FutureTask(myTask);
        es.submit(futureTask);
        System.out.println(futureTask.get());
        Thread.sleep(5000);
        System.out.println(futureTask.get());

    }
}
