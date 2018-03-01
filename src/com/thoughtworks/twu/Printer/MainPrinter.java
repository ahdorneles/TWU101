package com.thoughtworks.twu.Printer;

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
        printer.printInVerticalLine();
        printer.printFizzBuzz();

        printer.printGen(98);


    }
}
