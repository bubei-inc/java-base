package com.sun.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class DirectByteBufferNio {
    public static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        byte[] b = new byte[BUFFER_SIZE];
        File file = new File("/Users/james/test/txtFiles/from.txt");
        int len = (int) file.length();
        MappedByteBuffer buff;
        try (FileChannel channel = new FileInputStream(file).getChannel()) {
            // 将文件所有字节映射到内存中。返回MappedByteBuffer
            buff = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            for (int offset = 0; offset < len; offset += BUFFER_SIZE) {
                if (len - offset > BUFFER_SIZE) {
                    buff.get(b);
                } else {
                    buff.get(new byte[len - offset]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time is:" + (end - begin));
    }
}
