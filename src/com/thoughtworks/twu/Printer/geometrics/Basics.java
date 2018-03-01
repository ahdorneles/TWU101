package com.thoughtworks.twu.Printer.geometrics;

public class Basics {

    private int n;
    private static Basics basics;

    private Basics () {

    }

    public static Basics getBasics() {
        if (basics == null) {
            basics = new Basics();
        }
        return basics;
    }


    public void asterisks() {
        System.out.println("*");
    }

    public void verticalLine() {


        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

    }

    public void inLine() {


        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
