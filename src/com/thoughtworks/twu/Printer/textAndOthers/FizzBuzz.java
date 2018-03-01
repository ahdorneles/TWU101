package com.thoughtworks.twu.Printer.textAndOthers;

public class FizzBuzz {

    public void fizzBuzz() {
        for (int i = 0; i < 100; i++) {
            System.out.println(isItDivisible(i));
        }
    }

    private String isItDivisible(int i) {

        String three = "Fizz";
        String five = "Buzz";
        String temp = Integer.toString(i);

        if (i % 3 == 0) {
            if(i % 5 == 0) {
                temp = three + five;
                return temp;
            }
            temp = three;
        }
        if (i % 5 == 0) {
            temp = five;
        }
        return temp;

    }
}
