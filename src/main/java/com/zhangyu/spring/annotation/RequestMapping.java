package com.zhangyu.spring.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";

}
