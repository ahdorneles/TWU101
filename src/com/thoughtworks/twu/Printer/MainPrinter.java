package com.thoughtworks.twu.Printer;

import com.thoughtworks.twu.Printer.geometrics.Triangle;

public class MainPrinter {
    public static void main(String[] args) {

        Printer printer = new Printer(3);

        printer.printAsterisks();
        printer.printInLine();
        printer.printInVerticalLine();
        printer.printTriangle();
        printer.printIsoscelesTriangle();
        printer.printDiamond();
        printer.printDiamond("Adriana");


    }
}
