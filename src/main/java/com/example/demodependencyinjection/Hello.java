package com.example.demodependencyinjection;

public class Hello {

    private String message = "Default message";

    public Hello() {
    }

    public Hello(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
