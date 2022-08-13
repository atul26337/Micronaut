package com.example;

import com.example.aspect.introducation.StubExample;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import jakarta.inject.Inject;

import java.beans.IntrospectionException;
public class Application {
    @Inject
    AddClass addClass;
    public static void main(String[] args) throws IntrospectionException {
        ApplicationContext applicationContext =Micronaut.run(Application.class, args);

        StubExample stubExample = applicationContext.getBean(StubExample.class);
        boolean val=assertEquals(10, stubExample.getNumber());
        System.out.println("stubExample Bean  assert output "+val +" and value " +stubExample.getNumber() );
    }

    private static boolean assertEquals(int i, int number) {
        if(i==number){
            return true;
        }
        return  false;
    }


}