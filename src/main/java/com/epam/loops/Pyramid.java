package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i<cathetusLength; i++) {
            for (int j = 0; j<cathetusLength; j++) {
                System.out.println(" ");
            }
            for (int k = 1; k<= 2 * i - 1; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
