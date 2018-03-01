    package com.thoughtworks.twu.Printer.geometrics;

    public class Diamond {

        private int n;

        private Triangle triangle = Triangle.getTriangle();
        private static Diamond diamond = Diamond.getDiamond();

        private Diamond() {

        }

        public static Diamond getDiamond() {
            if (diamond == null) {
                diamond = new Diamond();
                }
                return diamond;
            }



        public void drawDiamond () {

            triangle.printIsoscelesTriangle();
            triangle.backWardsIsoscelesTriangle();
            }

        public void drawDiamond(String name) {

            triangle.isoscelesTriangle(true);
            System.out.println(name);
            triangle.backWardsIsoscelesTriangle();


        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            triangle.setN(n);

        }
    }
