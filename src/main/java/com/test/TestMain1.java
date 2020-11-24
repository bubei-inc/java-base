package com.test;


import com.son.stream.Student;
import com.sun.nio.FileChannelNio;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.concurrent.atomic.LongAdder;
import java.util.regex.Pattern;

public class TestMain1 {


    public static void main(String[] args) {
//        File file = new File("/Users/james/Downloads/tsf_python_docker_demo-1225/demo-mesh-shop/A");
//        System.out.println(file.getParent());
//        System.out.println(file.getParentFile());
//        System.out.println(isInteger(""));

//        Thread.currentThread().getContextClassLoader();
        System.out.println(StringUtils.isBlank(null));

        System.out.println(1&3);
        System.out.println(2&3);
        System.out.println(3&3);
        System.out.println(4&3);
        System.out.println(5&3);
        System.out.println(6&3);
        System.out.println(7&3);
        System.out.println(8&3);


        LongAdder adder = new LongAdder();
        adder.add(10L);
        System.out.println(adder.longValue());











    }
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

}
