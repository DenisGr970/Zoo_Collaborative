package com.virreymorcillo.zoo.model;

public class Dog extends Animal implements Pet{
    public Dog(String nombre){
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog.makeSound");
    }

    @Override
    public void play() {
        System.out.println("Dog.play");
    }
}
