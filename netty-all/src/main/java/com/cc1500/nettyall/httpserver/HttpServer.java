package com.cc1500.nettyall.httpserver;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.*;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class HttpServer {
    public static void main(String[] args)  throws  Exception{
        new HttpServer().run();
        //"https://api.thinkpage.cn/v2/weather/now.json?city=CHHE020000&language=zh-chs&unit=c&key=UVCU41N1DA\";
        //  mapping result;
    }

    public  void run() throws  Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();
        ServerBootstrap b = new ServerBootstrap();
        try {

            b.group(bossGroup, worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {

                            ChannelPipeline pi=socketChannel.pipeline();
                            pi.addLast("decoder", new HttpRequestDecoder());
                            pi.addLast("encoder", new HttpResponseEncoder());
                            pi.addLast("deflater", new HttpContentCompressor());
                            pi.addLast(new HttpServerHandler());
                        }
                    });
            ChannelFuture cf=b.bind(8899).sync();
            cf.channel().closeFuture().sync();

        }finally {
            bossGroup.shutdownGracefully();
            worker.shutdownGracefully();
        }

    }
}
