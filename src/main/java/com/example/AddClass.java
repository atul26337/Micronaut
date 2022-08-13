package com.example;

import com.example.aspect.around.LogMethod;
import com.example.aspect.introducation.StubExample;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class AddClass {
    @Inject
    StubExample stubExample;
    @LogMethod
    public int add(int a ,int b){
        stubExample.getNumber();
        return  a+b;
    }
}