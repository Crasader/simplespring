package com.zhangyu.spring.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowried {
    String value() default  "";
}
