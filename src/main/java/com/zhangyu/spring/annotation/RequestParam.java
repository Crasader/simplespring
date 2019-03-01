package com.zhangyu.spring.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";
}
