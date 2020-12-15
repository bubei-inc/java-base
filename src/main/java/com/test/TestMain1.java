package com.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tsf.v20180326.TsfClient;
import com.tencentcloudapi.tsf.v20180326.models.ApplicationForPage;
import com.tencentcloudapi.tsf.v20180326.models.DescribeApplicationsRequest;
import com.tencentcloudapi.tsf.v20180326.models.DescribeApplicationsResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        System.out.println(1 & 3);
        System.out.println(2 & 3);
        System.out.println(3 & 3);
        System.out.println(4 & 3);
        System.out.println(5 & 3);
        System.out.println(6 & 3);
        System.out.println(7 & 3);
        System.out.println(8 & 3);


        LongAdder adder = new LongAdder();
        adder.add(10L);
        System.out.println(adder.longValue());

        Credential credential = new Credential("AKIDDCxTnWrS8PPFzcBtMbkw3LPfmhQvG9u2", "tRjqleIfuvnyukKgneTR0GK9QGqDKFvP");
        String tsfEndpoint = "tsf.tencentcloudapi.com";
        HttpProfile tsfProfile = new HttpProfile();
        tsfProfile.setProtocol("https://");
        tsfProfile.setEndpoint(tsfEndpoint);
        ClientProfile tsfClientProfile = new ClientProfile();
        tsfClientProfile.setHttpProfile(tsfProfile);
        TsfClient client = new TsfClient(credential, "ap-shanghai", tsfClientProfile);

        List<ApplicationForPage> applications = new ArrayList<>();
        long limit = 50;
        long offset = 0;
        DescribeApplicationsRequest req = new DescribeApplicationsRequest();
        req.setApplicationType("C");
        req.setOffset(offset);
        req.setLimit(limit);
        try {
            while (true) {
                DescribeApplicationsResponse resp = client.DescribeApplications(req);
                if (null == resp.getResult() || resp.getResult().getTotalCount() == applications.size()) {
                    break;
                }
                applications.addAll(Arrays.asList(resp.getResult().getContent()));
                // 循环遍历获取所有的Application
                offset += limit;
                req.setOffset(offset);
            }
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSONString(applications, SerializerFeature.PrettyFormat));
//
//        List<String> names = new ArrayList<>();
//
//        for (int i = 0; i < 1000 ; i++) {
//            names.add("hello"+i);
//        }
//        System.out.println(names.contains("hello999"));

    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();

    }

}
