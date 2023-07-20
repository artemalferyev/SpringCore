package org.example;

public class Chinchilla implements Pet{

    public Chinchilla() {
        System.out.println("Dog is being created");
    }

    @Override
    public void talk() {
        System.out.println("af");
    }
}
