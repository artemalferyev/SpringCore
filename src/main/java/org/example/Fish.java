package org.example;

public class Fish implements Pet {

    public Fish() {
        System.out.println("Fish is being created");
    }

    @Override
    public void talk() {
        System.out.println("blub");
    }
}
