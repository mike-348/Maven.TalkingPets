package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int numberOfPets;
        String typeOfPet;

        List<Pets> petList = new ArrayList();

        System.out.println("How many pets do you have?");
        numberOfPets = inputInt.nextInt();


        for (int i = 0; i < numberOfPets; i++) {

            System.out.println("What kind of animal is each of your pets?");
            typeOfPet = inputString.nextLine();

            if (typeOfPet.equalsIgnoreCase("cat")) {
                petList.add(new Cat(typeOfPet));
            } else if (typeOfPet.equalsIgnoreCase("dog")) {
                petList.add(new Dog(typeOfPet));
            } else if (typeOfPet.equalsIgnoreCase("platypus")) {
                petList.add(new Platypus(typeOfPet));
            } else if (typeOfPet.equalsIgnoreCase("bird")) {
                petList.add(new Bird(typeOfPet));
            }
        }

        for (Pets p : petList) {
            System.out.println(p.getPetName() + " says " + p.speak() + "!");
        }

    }
}