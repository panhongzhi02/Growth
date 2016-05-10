package com.cubecare.taiji.cubecare;

import android.util.Log;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by panho on 2015/12/16.
 */
public class ClientHandler extends ChannelInboundHandlerAdapter{

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        Log.d("ClientHandler","注册连接");
        super.channelRegistered(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        Log.d("ClientHandler","注销连接");
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Log.d("ClientHandler","连接活跃");
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Log.d("ClientHandler","连接空闲");
        super.channelInactive(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Log.d("ClientHandler","读取连接");
        super.channelRead(ctx, msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        Log.d("ClientHandler","读取完成");
        super.channelReadComplete(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Log.d("ClientHandler","出现异常");
        super.exceptionCaught(ctx, cause);
    }
}
