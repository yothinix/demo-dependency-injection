package com.example.demodependencyinjection;

public class Client {
    public static void main(String[] args) {

        // Constructor Injection
//        Hello hello = new Hello("John");
//        String message = hello.getMessage();

        // Setter Injection
        Hello hello = new Hello();
        hello.setMessage("James");
        String message = hello.getMessage();

        System.out.println("Hello, My name is " + message);

        System.out.println("============================");
        String dependencyName = hello.getDependency().getName();
        System.out.println(dependencyName);
    }
}
