package com.example.aspect.around;

import io.micronaut.aop.Around;
import io.micronaut.context.annotation.Type;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME) //Step 1
@Target({ElementType.TYPE, ElementType.METHOD})//Step 2
@Around //Step 3
@Type(LoggingInterceptor.class) //Step 4
public @interface LogMethod {
}
