package com.sun.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelNio {
    public static void main(String[] args) throws IOException {

        // 文件较小时使用阻塞io时间相对较小，但是一旦文件较大，使用传统io的时间会不如NIO的处理方式。
        String fromPath = "/Users/james/test/txtFiles/from.txt";
        String toPath = "/Users/james/test/txtFiles/to.txt";
        FileInputStream fromFile = new FileInputStream(fromPath);
        FileChannel fromFileChannel = fromFile.getChannel();
        FileOutputStream toFile = new FileOutputStream(toPath);
        FileChannel toFileChannel = toFile.getChannel();

        long startTime = System.nanoTime();
        fromFileChannel.transferTo(0, fromFileChannel.size(), toFileChannel);
        System.out.println(System.nanoTime() - startTime);
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(fromPath)));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(toPath)))) {
            byte[] buf = new byte[1024];
            long staTime = System.nanoTime();
            while ((bis.read(buf)) != -1) {
                bos.write(buf);
            }
            System.out.println(System.nanoTime() - staTime);


//        int len;
//        ByteBuffer btf = ByteBuffer.allocate(1024);
//        while((len = fromFileChannel.read(btf)) > 0) {
//            System.out.println(len);
//            System.out.println(new String(btf.array(),0, len));
//        }
//        toFileChannel.close();
//        fromFileChannel.close();
        }
    }
}
