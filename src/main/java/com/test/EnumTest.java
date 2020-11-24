package com.test;

public enum EnumTest {
    Region("region", "上海");

    private String name;
    private String value;

    EnumTest(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
