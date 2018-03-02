package thoughtworks.twu.Printer.geometrics;


public class Triangle {

    private int n;
    private static Triangle triangle;

    public static Triangle getTriangle() {
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle;
    }

    private Triangle () {

    }


    public void printInTriangle() {

        String ast = "*";

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(ast);

            }
            System.out.println();
        }
    }

    public void backWardsIsoscelesTriangle() {

        int size = n *  2;

        for (int i = n - 2; i >= 0; i--) {
            iteratingTriangleLine(size, i);

        }
    }


    public void isoscelesTriangle(boolean hasAname) {


        int size = n * 2 - 1;
        int tempN = hasAname ? n - 1 : n;

        for (int i = 0; i < tempN; i++) {
            iteratingTriangleLine(size, i);

        }

    }

    private void iteratingTriangleLine(int size, int i) {

        String ast = "*";
        String space = " ";
        String tab = tab();

        for (int j = 0; j <= size; j++) {

            if (i + j >= n && j <= n + i) {
                System.out.print(ast);
            } else {
                System.out.print(space);
            }
        }
        System.out.println();
    }

    private String tab() {
        return "";
    }

    public void printIsoscelesTriangle () {

        isoscelesTriangle(false);


    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
