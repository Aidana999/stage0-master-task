package com.epam.OOP;

public class Animal {
  private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;

    }

    public String getDescription() {
        String furStatus;
        if (hasFur) {
            furStatus = "a";
        } else {
            furStatus = "no";
        }

        String pawWord;
        if (numberOfPaws == 1) {
            pawWord = "paw";
        } else {
            pawWord = "paws";
        }

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + furStatus + " fur.";
    }

}
