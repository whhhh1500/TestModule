package com.cc1500.NioModule;

import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;
import java.util.Queue;

public class test1 {
    public static void main(String[] args)  throws  Exception{
        ServerSocketChannel socketChannel= ServerSocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.bind(new InetSocketAddress(8899));
        Selector s1=Selector.open();
        ThreadDemo t1=new ThreadDemo();


    }
 public static class ThreadDemo extends Thread{
        static  void Initqueeue(){
           ArrayList<Queue>  queue =new ArrayList<>();
        }
        public void run(){

        }

    }
}
