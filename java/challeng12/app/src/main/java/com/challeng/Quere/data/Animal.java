package com.challeng.Quere.data;

public class Animal {

    private final String animalName;
    private final String animalType;

    private Animal next;

    public Animal(String animalName, String animalType) {
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public void setNext(Animal next) {
        this.next = next;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Animal getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
