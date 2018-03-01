        package com.thoughtworks.twu.Printer;


        import com.thoughtworks.twu.Printer.geometrics.Basics;
        import com.thoughtworks.twu.Printer.geometrics.Diamond;
        import com.thoughtworks.twu.Printer.geometrics.Triangle;

        public class Printer {

            private int n;
            private Basics basics = Basics.getBasics();
            private Triangle triangle = Triangle.getTriangle();
            private Diamond diamond = Diamond.getDiamond();

            Printer(int n) {
                this.n = n;
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
                System.out.println("--------------------------------------");

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




