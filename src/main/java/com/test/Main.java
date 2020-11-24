package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
//        String response = getResult();
//        KubeAPIServerDto kubeAPIServerDto = JSON.parseObject(response, KubeAPIServerDto.class);
//        Config config = new ConfigBuilder().withMasterUrl(kubeAPIServerDto.getAddress())
//                .withClientCertData(kubeAPIServerDto.getAuthorization().getClientCertData())
//                .withClientKeyData(kubeAPIServerDto.getAuthorization().getClientCertKeyData())
//                .withTrustCerts(true).build();
//        KubernetesClient client = new DefaultKubernetesClient(config);
//		PodList list = client.pods().inNamespace("kube-system").list();
//
//		for (Pod pod : list.getItems()) {
//            System.out.println(pod);
//        }
//		System.out.println(JSON.toJSONString(list, SerializerFeature.PrettyFormat));
        System.out.println(EnumTest.Region.getValue());
    }

    private static String getResult() {
        return "{\n" +
                "        \"address\": \"https://123.57.245.65:6443\",\n" +
                "        \"authorization\": {\n" +
                "            \"clientCertData\": \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURWekNDQWorZ0F3SUJBZ0lER25SQk1BMEdDU3FHU0liM0RRRUJDd1VBTUdveEtqQW9CZ05WQkFvVElXTmoKT0dGaU5HRTJOemd3T1dRME1qQmxPVFZoT1ROaFpESTNZV0ptT0dRd05ERVFNQTRHQTFVRUN4TUhaR1ZtWVhWcwpkREVxTUNnR0ExVUVBeE1oWTJNNFlXSTBZVFkzT0RBNVpEUXlNR1U1TldFNU0yRmtNamRoWW1ZNFpEQTBNQjRYCkRUSXdNRGt5TXpBNU5UUXdNRm9YRFRJek1Ea3lNekE1TlRrMU9Wb3dTREVWTUJNR0ExVUVDaE1NYzNsemRHVnQKT25WelpYSnpNUWt3QndZRFZRUUxFd0F4SkRBaUJnTlZCQU1UR3pFNU1ERTJNRFEyT0RVME1EWXlPVGd0TVRZdwpNRGcxTlRFNU9UQ0JuekFOQmdrcWhraUc5dzBCQVFFRkFBT0JqUUF3Z1lrQ2dZRUF4SUR0K2FyaE5LUHF5clJ4CnFyYzlmSm1OTGVpQVB2WVY0eE5rYklwUXc5YlR6U1M4SVdDOFhYbWFES1hEL3I0ZGNGVFJuNDlIeFFyNEdOOXkKOXZ5dVBkSDBPblBaUmdYRWxKZjQzZVVWWjYrTE9nRnIvRGl6NlMwUzJFdTF2Yjloa2FkZGlrK3lPYURvRG1vQgpDOTRxdGF4WTJyaVF2eHhDd2FUQW5zQzJwWU1DQXdFQUFhT0JxekNCcURBT0JnTlZIUThCQWY4RUJBTUNCNEF3CkV3WURWUjBsQkF3d0NnWUlLd1lCQlFVSEF3SXdEQVlEVlIwVEFRSC9CQUl3QURBOEJnZ3JCZ0VGQlFjQkFRUXcKTUM0d0xBWUlLd1lCQlFVSE1BR0dJR2gwZEhBNkx5OWpaWEowY3k1aFkzTXVZV3hwZVhWdUxtTnZiUzl2WTNOdwpNRFVHQTFVZEh3UXVNQ3d3S3FBb29DYUdKR2gwZEhBNkx5OWpaWEowY3k1aFkzTXVZV3hwZVhWdUxtTnZiUzl5CmIyOTBMbU55YkRBTkJna3Foa2lHOXcwQkFRc0ZBQU9DQVFFQUVUYXNYdmFJc0VwYUxWTHJnaXdwYlNTTVozNWMKUzB3OExsY1FuNm1RR3czL0cvbVFIcXltaGFBeCtjQ2RuUmZPemQ3RWlWMEF3dWRIL3d2eDFjLzF0L1h2YlBscQo4Uml0NG1ZblVtOEJiTkdyWjdwWURYcGFhZHc5a0kxQkJ5YlpUU0J1cHBGV0lLN0dobjBHY3lVZTB5WGNSZnFyCm9jaFFKOU5idWExN1FNSm0zQUNqMis4cjVhLzVDSXpwS1N4T0I0OVBLTHA4SDdHbzVCZkkzRWdIdURwMFlxb2wKQkdiL1NDVkx3R0dhWDdiOElHbGtTZkN5UitOYTNaVHFrOEtFa0R1SGxnMDJZalhKZXQyWUh0UGh3UjFyUHpQawpHY2tGQjkxRHlqSURIMUVid3dGV0lraUlMWWY5ZXdkVTJhazVwVkdHOHNlMXdiYWV0RWNlZ2Q3dkVBPT0KLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=\",\n" +
                "            \"clientCertKeyData\": \"LS0tLS1CRUdJTiBSU0EgUFJJVkFURSBLRVktLS0tLQpNSUlDWGdJQkFBS0JnUURFZ08zNXF1RTBvK3JLdEhHcXR6MThtWTB0NklBKzloWGpFMlJzaWxERDF0UE5KTHdoCllMeGRlWm9NcGNQK3ZoMXdWTkdmajBmRkN2Z1kzM0wyL0s0OTBmUTZjOWxHQmNTVWwvamQ1UlZucjRzNkFXdjgKT0xQcExSTFlTN1c5djJHUnAxMktUN0k1b09nT2FnRUwzaXExckZqYXVKQy9IRUxCcE1DZXdMYWxnd0lEQVFBQgpBb0dCQUxhODk1SGcyWUhzbGVKZ0gveVVYM2ZLREVLUEh3UnVNVGgweGtVeDg1M0w0RGU4VzcvbWlBV2RtaWI4CjJPSER4dmk1eUI5TVRYL3VqWDREL3BPMXRBcGtPVWExNXhmZ2FYVE1nRWpYT3RkeGw4bmVDa0QwRHhObzlWY3cKOElwajVEeXlad213MzZGWUhPYi8xY1JSOGFBSjFydXI5UFNpcjJPNjFDUjZ2NmZ4QWtFQTJ3OGRJQS9sT1VaZgpRWWNoa2R6RzVSK3FvVmFGdEYxeDNZYnFWSFdVVUtMU3lhVlRVaEFiZXpoMFZOMlFMMDh3bGU4ZXBnVmpJUk1MClQyeUZ3Y3h1TndKQkFPV2tGbnZvK1ltS2NYOGQ1Y3M2cGwzMzBLUjVrbkxVaUNtcDlDT29wNkQ0cUtTZzJnQjEKZFRDVzJTVVdza1BIdGU2NVdoTENtZHJ0U09UbWF5MkZ2UlVDUVFESVQ1RzZkODZNQ1NXaHJnZXNjYzRPUmw2cApHWTA1MlJqK0VSakdFcDZFL2Q3eU5STnp2dmJpUGtWaU5SaGJxbllySkhWS0t6THlVNC9NR05oVzFyRVJBa0VBCjBRdGxlRmpseUFJaVBYQnUvbWtlaDQ0Ty9acTU2UlIxKzA5K01uUFdYTi9mVFRZc0haelBHSE5KcXN5VmJNUkIKWnRhT0cyUFJBUTFlZlJrUVdmbFQzUUpBS1NjMnNmUHovTXdIOHlySHNJaGpKdWJuYklhckViZXpJRkhwTVZDMgovV3JsUlZLcGhSTDhxbUcyaGVkSHFYL2pEVFhuSXZjQXNzOXdPM2FXdkpKTlZ3PT0KLS0tLS1FTkQgUlNBIFBSSVZBVEUgS0VZLS0tLS0K\",\n" +
                "            \"credentials\": \"\",\n" +
                "            \"type\": \"Certs\"\n" +
                "        }\n" +
                "    }";
    }
}
