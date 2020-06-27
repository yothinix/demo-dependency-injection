package com.example.demodependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    private String petName = "This is a dog";

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
