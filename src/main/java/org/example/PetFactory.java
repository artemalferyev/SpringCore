package org.example;

public class PetFactory {

    public Pet createPet(){
        return (Math.random() < 0.5) ? new Chinchilla() : new Fish();
    }
}
