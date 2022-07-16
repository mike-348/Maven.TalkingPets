package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainApplicationTest {

    @Test
    public void setNewPetName() {
        Pets p = new Platypus("ferb");
        p.setNewPetName("perry");

        Assert.assertEquals("perry", p.getPetName());
    }

    @Test
    public void platypusSpeakTest() {
        Pets p = new Platypus("perry");
        p.speak();

        Assert.assertEquals("gggghh", p.speak());
    }

    @Test
    public void catSpeakTest(){
        Pets p = new Cat("sylvester");
        p.speak();

        Assert.assertEquals("meoww", p.speak());
    }

    @Test
    public void dogSpeakTest(){
        Pets p = new Dog("meowster");
        p.speak();

        Assert.assertEquals("WOOF", p.speak());
    }

    @Test
    public void birdSpeakTest(){
        Pets p = new Bird("tweety");
        p.speak();

        Assert.assertEquals("chirp!", p.speak());
    }
}