package com.example.aspect.introducation;

import com.example.aspect.introducation.Stub;
import io.micronaut.aop.*;
import io.micronaut.core.annotation.Nullable;
import jakarta.inject.Singleton;

@Singleton
@InterceptorBean(Stub.class) //step 1
public class StubIntroduction implements MethodInterceptor<Object, Object> { //

    @Nullable
    @Override
    public Object intercept(MethodInvocationContext<Object, Object> context) {
        return context.getValue( //step 2
                Stub.class,
                context.getReturnType().getType()
        ).orElse(null); // step 3
    }
}
