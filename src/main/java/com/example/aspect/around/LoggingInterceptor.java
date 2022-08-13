package com.example.aspect.around;

import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;
import io.micronaut.inject.ExecutableMethod;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

@Singleton
public class LoggingInterceptor implements MethodInterceptor<Object, Object> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingInterceptor.class);


    @Override
    public Object intercept(MethodInvocationContext<Object, Object> context) {
        Map<String, Object> contextParameterValueMapValueMap = context.getParameterValueMap();
        ExecutableMethod executableMethod = context.getExecutableMethod();
        String methodName = executableMethod.getMethodName();
        LOGGER.info("Method operation: {} with  parameters: {}", methodName, contextParameterValueMapValueMap);
        Object outputTobeReturn;
        try{
            outputTobeReturn = context.proceed();
            LOGGER.info("Method  operation result: {} for parameter : {} with return value: {} ", methodName, contextParameterValueMapValueMap, outputTobeReturn);
            return outputTobeReturn;
        }catch (Exception e){
            LOGGER.error("Exception: {} in performing operation: {} for parameter on method: {}",
                    e.getClass()+ "-" + e.getMessage(),methodName, contextParameterValueMapValueMap, e);
            throw e;
        }
    }
}
