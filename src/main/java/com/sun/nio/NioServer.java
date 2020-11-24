package com.sun.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NioServer {
    public static void main(String[] args) {
        try {

            ServerSocketChannel channel = ServerSocketChannel.open();
            channel.configureBlocking(false);
            ServerSocket serverSocket = channel.socket();
            serverSocket.bind(new InetSocketAddress(8080));
            System.out.println("Star server!!!!!");
            Selector selector = Selector.open();
            // 当前channel 已经bind了一个端口此时，该channel只对连接上这个channel的client感兴趣，此时只需要设置当前的
            // selector 关注是op_accept的channel.
            channel.register(selector, SelectionKey.OP_ACCEPT);
            // selector.select() 是一个阻塞方法
            while (selector.select() > 0) {
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey selectionKey = it.next();
                    //如果当前selectionKey为Acceptable,加入selector中
                    if (selectionKey.isAcceptable()) {
                        ServerSocketChannel acceptChannel = (ServerSocketChannel) selectionKey.channel();
                        SocketChannel acceptSocketChannel = acceptChannel.accept();
                        acceptSocketChannel.configureBlocking(false);
                        System.out.println("add accepted!!!");
                        acceptSocketChannel.register(selector, SelectionKey.OP_READ);
                    }
                    if (selectionKey.isReadable()) {
                        System.out.println("start to read ");
                        SocketChannel readChannel = (SocketChannel) selectionKey.channel();
                        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                        int len;
                        while ((len = readChannel.read(byteBuffer)) > 0) {
//                            byteBuffer.flip();
                            System.out.println(new String(byteBuffer.array(), 0, len));
                            byteBuffer.clear();
                        }
                        if (len == -1) {
                            System.out.println("断开");
                            readChannel.close();
                        }
                    }
                }
                it.remove();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ;
}
