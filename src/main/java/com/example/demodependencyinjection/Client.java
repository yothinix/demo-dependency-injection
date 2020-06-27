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

        // Constructor Injection
//        Dependency dependency = new Dependency();
//        dependency.setName("Dependency by constructor injection");
//        Hello hello2 = new Hello(dependency);
//        System.out.println(hello2.getDependency().getName());

        // Setter Injection
        Dependency dependency = new Dependency();
        dependency.setName("Dependency by setter injection");
        hello.setDependency(dependency);
        System.out.println(hello.getDependency().getName());
    }
}
