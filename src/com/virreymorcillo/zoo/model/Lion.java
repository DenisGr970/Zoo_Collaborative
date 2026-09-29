package com.virreymorcillo.zoo.model;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("makeNoise");
    }
}