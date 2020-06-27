package com.example.demodependencyinjection;

public class Client {
    public static void main(String[] args) {

        Hello hello = new Hello();
        String message = hello.getMessage();

        System.out.println("Hello, My name is" + message);

    }
}
