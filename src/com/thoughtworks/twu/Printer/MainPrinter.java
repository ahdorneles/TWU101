package com.thoughtworks.twu.Printer;

public class MainPrinter {
    public static void main(String[] args) {

        Printer printer = new Printer(3);


        printer.printAsterisks();
        printer.printVerticalLine();
        printer.printInLine();
        printer.printInTriangle();
        printer.printIsoscelesTriangle();
        printer.printDiamond();
        printer.printDiamondWithAName("Adriana");

    }
}
