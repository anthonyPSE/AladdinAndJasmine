package com.anthonypse.aladdinandjasmine;


/**
 * Created by Anthony Osteen 04 September 2018
 *
 * This is just a simple fizzbuzz variation to demonstrate minimum java viability.
 * I'll copy/paste the exact instructions:
 *
 * "Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Jasmine" instead of
 * the number and for the multiples of five print "Aladdin". When number is divided by both three and five,
 * print "Jasmine and Aladdin"."
 */

public class AladdinAndJasmine {

    /**
     * The main function where all the...ermm...magic...happens.
     * @param args System args
     */
    public static void main(String[] args) {
        System.out.println("Hello, Jasmine and Aladdin!");

        for (int i = 1; i <= 100; i++) {
            //I like to give names to the magic numbers so they're easier to read further down
            boolean modThree = (i % 3 == 0);
            boolean modFive = (i % 5 == 0);

            if (modThree && modFive) {
                System.out.println("Aladdin and Jasmine");
            } else if (modThree) {
                //For multiples of three print "Jasmine" instead of the number
                System.out.println("Jasmine");
            } else if (modFive) {
                //for the multiples of five print "Aladdin"
                System.out.println("Aladdin");
            } else {
                //NB: The instructions imply to print out the number if none of the other cases are true
                System.out.println(String.valueOf(i));
            }
        }
    }
}
