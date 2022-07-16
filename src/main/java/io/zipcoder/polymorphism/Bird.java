package io.zipcoder.polymorphism;

public class Bird extends Pets{

    public Bird(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "chirp!";
    }
}
