package com.example.aspect.introducation;

import io.micronaut.aop.Introduction;
import io.micronaut.context.annotation.Bean;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Introduction //1
@Bean //2
@Documented
@Retention(RUNTIME)
@Target({TYPE, ANNOTATION_TYPE, METHOD})
public @interface Stub {
    String value() default "";
}