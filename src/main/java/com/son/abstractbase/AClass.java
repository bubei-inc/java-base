package com.son.abstractbase;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class AClass {
     abstract String hello();

     public String sayHello() {
          return hello();
     }

}
