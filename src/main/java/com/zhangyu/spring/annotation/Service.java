package com.zhangyu.spring.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default  "";
}
