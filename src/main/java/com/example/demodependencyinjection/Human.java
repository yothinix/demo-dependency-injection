package com.example.demodependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name = "My name is Yothin";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
