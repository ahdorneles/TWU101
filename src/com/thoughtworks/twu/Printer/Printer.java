        package com.thoughtworks.twu.Printer;


        public class Printer {

            private int n;

            Printer(int n) {
                this.n = n;
            }


            public void printAsterisks() {
                System.out.println("- Printing one asterisks in one line - ");
                System.out.println("*");
                System.out.println("-----------------------------------");
            }

            public void printVerticalLine() {

                System.out.println("- Printing " + n + " asterisks in " + n + " lines - ");

                for (int i = 0; i < n; i++) {
                    System.out.println("*");
                }
                System.out.println("-----------------------------------");

            }

            public void printInLine() {

                System.out.println("- Printing " + n + " asterisks in one line - ");

                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println("\n--------------------------------------");
            }

            public void printInTriangle() {

                System.out.println("- Drawing a triangle with " + n + " lines - ");

                for (int i = 0; i < n; i++) {

                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }
                System.out.println("--------------------------------------");
            }

            private void backWardsIsoscelesTriangle(int num) {
                int size = n *  2;

                if (num == -1) {

                    for (int i = n - 2; i >= 0; i--) {
                        iteratingTriangleLine(size, i);

                    }
                }
            }


            public void isoscelesTriangle(boolean hasAname) {


                int size = n * 2 - 1;
                int tempN = n;

                if(hasAname) {
                    tempN = n - 1;
                }
                    for (int i = 0; i < tempN; i++) {
                        iteratingTriangleLine(size, i);

                    }

                }

            private void iteratingTriangleLine(int size, int i) {

                for (int j = 0; j <= size; j++) {

                    if (i + j >= n && j <= n + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            public void printIsoscelesTriangle () {

                System.out.println("- Drawing a triangle  with " + n + " lines - ");
                isoscelesTriangle(false);
                System.out.println("--------------------------------------");


            }


            public void printDiamond() {

                System.out.println("- Drawing a diamond  with " + (n  * 2 - 1) + " lines - ");
                isoscelesTriangle(false);
                backWardsIsoscelesTriangle(-1);
                System.out.println("--------------------------------------");


            }

            public void printDiamondWithAName(String name) {

                System.out.println("- Drawing a diamond  with " + (n  * 2 - 1) + " lines - ");

                isoscelesTriangle(true);
                System.out.println(name);
                backWardsIsoscelesTriangle(-1);
                System.out.println("--------------------------------------");


            }
        }




