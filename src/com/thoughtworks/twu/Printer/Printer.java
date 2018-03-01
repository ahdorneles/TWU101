        package com.thoughtworks.twu.Printer;


        import com.thoughtworks.twu.Printer.geometrics.Basics;
        import com.thoughtworks.twu.Printer.geometrics.Diamond;
        import com.thoughtworks.twu.Printer.geometrics.Triangle;
        import com.thoughtworks.twu.Printer.textAndOthers.FizzBuzz;
        import com.thoughtworks.twu.Printer.textAndOthers.Generator;

        public class Printer {

            private int n;
            private Basics basics = Basics.getBasics();
            private Triangle triangle = Triangle.getTriangle();
            private Diamond diamond = Diamond.getDiamond();
            private FizzBuzz fizzBuzz = new FizzBuzz();
            private Generator generator = new Generator();

            Printer(int n) {
                this.n = n;
            }

            public void printGen (int n) {
                System.out.println("- Printing "+ n + "'s factors in ascending order - ");
                generator.findFactors(n);
                System.out.println("-----------------------------------");

            }


            public void printFizzBuzz () {
                System.out.println("- Printing FizzBuzz - ");
                fizzBuzz.fizzBuzz();
                System.out.println("-----------------------------------");

            }

            public void printAsterisks () {
                basics.setN(n);
                System.out.println("- Printing one asterisks in one line - ");
                basics.asterisks();
                System.out.println("-----------------------------------");

            }

            public void printInLine () {
                basics.setN(n);
                System.out.println("- Printing " + n + " asterisks in one line - ");
                basics.inLine();
                System.out.println("\n--------------------------------------");

            }

            public void printInVerticalLine() {
                basics.setN(n);
                System.out.println("- Printing " + n + " asterisks in " + n + " lines - ");
                basics.verticalLine();
                System.out.println("--------------------------------------");

            }

            public void printTriangle() {
                System.out.println("- Drawing a triangle with " + n + " lines - ");
                triangle.setN(n);
                triangle.printInTriangle();
                System.out.println("--------------------------------------");


            }

            public void printIsoscelesTriangle () {
                triangle.setN(n);
                System.out.println("- Drawing a triangle  with " + n + " lines - ");
                triangle.isoscelesTriangle(false);
                System.out.println("--------------------------------------");

            }

            public void printDiamond () {
                diamond.setN(n);
                System.out.println("- Drawing a diamond  with " + (n * 2 - 1) + " lines - ");
                diamond.drawDiamond();
                System.out.println("--------------------------------------");
            }

            public void printDiamond(String name) {
                diamond.setN(n);
                System.out.println("- Drawing a diamond  with " + (n * 2 - 1) + " lines - ");
                diamond.drawDiamond(name);
                System.out.println("--------------------------------------");

            }


        }




