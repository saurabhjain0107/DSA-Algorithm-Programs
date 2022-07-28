package com.bridgelabz.datastructure;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i = 0;
        int number = 0;
        String primeNumbers = "";

        for (i = 0; i <= 1000; i++) {
            int counter = 0;
            for (number = i; number >= 1; number--) {
                if (i % number == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 0 to 1000 are :");
        System.out.println(primeNumbers);
    }
}