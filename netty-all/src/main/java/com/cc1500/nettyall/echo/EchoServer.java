package com.cc1500.nettyall.echo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class EchoServer {
    public static void main(String[] args) throws  Exception {

        EchoServer echo=new EchoServer();
        echo.start();


    }

    public    void start() throws  Exception{
        EventLoopGroup boss=new NioEventLoopGroup();
        EventLoopGroup worker=new NioEventLoopGroup();
        ServerBootstrap bootstrap =new ServerBootstrap();
        try {
            bootstrap.group(boss,worker).channel(NioServerSocketChannel.class)
                    .localAddress(8899)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline pi= ch.pipeline();

                            pi.addLast(new EchoChannelServer());
                        }
                    });
            ChannelFuture f=  bootstrap.bind(8899).sync();
            f.channel().closeFuture().sync();
        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }


    }
}
