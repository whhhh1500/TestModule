package com.cc1500.nettyall.echo;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class EchoClient {

        public static void main(String[] args) throws  Exception {


            EchoClient echo=new EchoClient();
            echo.start();


        }
        public    void start() throws  Exception{
            EventLoopGroup worker=new NioEventLoopGroup();
             Bootstrap bootstrap =new  Bootstrap();
            try {
                bootstrap.group(worker).channel(NioSocketChannel.class)
                        .remoteAddress("127.0.0.1",8899)
                        .handler(new ChannelInitializer<SocketChannel>() {
                            @Override
                            protected void initChannel(SocketChannel ch) throws Exception {
                                ChannelPipeline pi= ch.pipeline();
                                pi.addLast(new EchoChannelClient());
                            }
                        });
                ChannelFuture f=  bootstrap.connect().sync();
                f.channel().closeFuture().sync();
            }finally {
                worker.shutdownGracefully();
            }


        }
    }
