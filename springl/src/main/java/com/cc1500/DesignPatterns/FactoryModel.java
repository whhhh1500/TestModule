package com.cc1500.DesignPatterns;

public class FactoryModel {
    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Benz");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种汽车。。。");
        }

    }


    // 工厂类
    static class Factory {
        public static Car getCarInstance(String type) {
            Car c = null;
            if ("Benz".equals(type)) {
                c = new Benz();
            }
            if ("Ford".equals(type)) {
                c = new Ford();
            }
            return c;
        }
    }
    // 抽象产品类
    interface     Car {
        public void run();

        public void stop();
    }

    // 具体实现类
    static class Benz implements Car {
        public void run() {
            System.out.println("Benz开始启动了。。。。。");
        }

        public void stop() {
            System.out.println("Benz停车了。。。。。");
        }
    }

    static class Ford implements Car {
        public void run() {
            System.out.println("Ford开始启动了。。。");
        }

        public void stop() {
            System.out.println("Ford停车了。。。。");
        }
    }
}
