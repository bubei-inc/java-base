package com.son.sort;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sun.syp
 * @version $Id: com.son.sort#SortMain, v 0.1 2021/07/14 17:39:41 sun.syp Exp $
 */
public class SortMain {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("测试1", "测试2", "测试10", "root1", "测试1a");
        List<String> strs = strings.stream().sorted((o, p) -> {
            if (o.length() == p.length()) {
                return o.compareTo(p);
            } else {
                int len = Math.min(o.length(), p.length());
                String oF = o.substring(0, len - 1);
                String pF = p.substring(0, len - 1);
                if (oF.compareTo(pF) == 0) {
                    return o.length() - p.length();
                } else {
                    return oF.compareTo(pF);
                }
            }
        }).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(strs));
    }
}
