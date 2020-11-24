package com.sun.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileChannelTransferFromNio {
    public static void main(String[] args) {
        try {
            String fromPath = "/Users/james/test/txtFiles/from.txt";
            String toPath = "/Users/james/test/txtFiles/to.txt";
            FileInputStream fromFile = new FileInputStream(fromPath);
            FileChannel fromChannel = fromFile.getChannel();
            FileOutputStream toFile = new FileOutputStream(toPath);
            FileChannel toChannel = toFile.getChannel();
            System.out.println(fromChannel.size());
//            fromChannel.transferTo(0, fromChannel.size(), toChannel);
            // 与transferTo() 方法作用相反
            toChannel.transferFrom(fromChannel, 0, fromChannel.size());
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
