package com.son.abstractbase;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BClass extends AClass {
    @Override
    String hello() {
        return "B";
    }
}
