package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;
import org.slf4j.MDC;

import java.security.Principal;

@Controller("math")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestController {
    @Inject
    AddClass aClass;
    @Get("/")
    public MutableHttpResponse<Integer> add() {
            return HttpResponse.ok(aClass.add(2,4));
    }
}
