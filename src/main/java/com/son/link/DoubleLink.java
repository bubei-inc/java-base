package com.son.link;

import lombok.Data;

@Data
public class DoubleLink {
    private String data;
    private DoubleLink prev ;
    private DoubleLink next;

}
