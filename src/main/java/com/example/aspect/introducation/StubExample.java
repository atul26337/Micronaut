package com.example.aspect.introducation;

import java.time.LocalDateTime;

@Stub
public interface StubExample {

    @Stub("10")
    int getNumber();

    LocalDateTime getDate();
}