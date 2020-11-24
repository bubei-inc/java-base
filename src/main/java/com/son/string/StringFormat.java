package com.son.string;


public class StringFormat {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b);
        // in String equals just compare whether the values  are equal.
        String name = "echo '#!/bin/bash \n" +
                "rm -rf /etc/kubernetes \n" +
                "systemctl stop kubelet 2>/dev/null \n" +
                "systemctl stop docker 2>/dev/null \n" +
                "ip link del cni0 2>/etc/null \n" +
                "for port in 80 2379 6443 8086 {10249..10259} ; do \n" +
                "    fuser -k -9 ${port}/tcp \n" +
                "done \n" +
                "rm -fv /root/.kube/config \n" +
                "rm -rfv /var/lib/kubelet \n" +
                "rm -rfv /var/lib/cni \n" +
                "rm -rfv /etc/cni \n" +
                "rm -rfv /var/lib/etcd \n" +
                "rm -rfv /var/lib/postgresql /etc/core/token /var/lib/redis /storage /chart_storage \n" +
                "docker rm -f $(docker ps -aq) 2>/dev/null \n" +
                "systemctl start docker 2>/dev/null ' > uninstall.sh";
        System.out.println(name);
    }
}
