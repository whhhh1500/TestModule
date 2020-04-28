package com.cc1500.nettyall.NettyNioServer;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.CharsetUtil;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class NettyNioServer {
    public static void main(String[] args) throws  Exception {
        NettyNioServer nns=new NettyNioServer();
        nns.server(8899);
    }
    public void server(int port) throws Exception {
        final ByteBuf buf = Unpooled.copiedBuffer("Hi!\r\n", Charset.forName("UTF-8"));
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(group).channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                        @Override
                        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                          ByteBuf in =(ByteBuf)msg ;

                            System.out.println( in.toString(CharsetUtil.UTF_8));
                        }

                        @Override
                        public void channelActive(ChannelHandlerContext ctx) throws Exception {
                            ctx.writeAndFlush(buf.duplicate())
                                    .addListener(ChannelFutureListener.CLOSE);
                        }
                    });
                }
            });
            ChannelFuture f = b.bind().sync();
            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();
        }
    }
}