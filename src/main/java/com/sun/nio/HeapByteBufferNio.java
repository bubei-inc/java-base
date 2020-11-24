package com.sun.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class HeapByteBufferNio {
    public static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {

        File file = new File("/Users/james/test/txtFiles/from.txt");

        long begin = System.currentTimeMillis();
        try (FileChannel channel = new FileInputStream(file).getChannel();) {
            // 申请HeapByteBuffer
            ByteBuffer buff = ByteBuffer.allocate(BUFFER_SIZE);
            while (channel.read(buff) != -1) {
                buff.flip();
                buff.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time is:" + (end - begin));
    }
}
