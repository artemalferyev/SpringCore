package org.example;

import java.util.List;

public class Friend {
    private List<Pet> pets;
    private String name;

    public Friend(String name) {
        this.name = name;
        System.out.println("Friend is being created");
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public void interact(){
        pets.forEach(Pet::talk);
    }
}


