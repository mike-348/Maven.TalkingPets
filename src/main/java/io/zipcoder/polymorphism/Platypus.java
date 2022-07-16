package io.zipcoder.polymorphism;

public class Platypus extends Pets{
    public Platypus(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "gggghh";
    }
}
