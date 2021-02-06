package com.github.junittest.triangle;

public class Triangle {
    private int a;
    private int b;
    private int c;

    /**
     * Command line interface.
     *
     * @param args The command line parameters.
     */
    public static void main(String[] args) {
        System.out.println(getType(2, 1, 1));
    }

    /**
     * Initialize new object
     *
     * @param a first side of triangle
     * @param b second side of triangle
     * @param c third side of triangle
     */
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Returns the type of the triangle based on the given three side values.
     * @param a first side of triangle.
     * @param b second side of triangle.
     * @param c third side of triangle.
     * @return type of triangle.
     */
    public static String getType(int a, int b, int c) {
        String type = "";
        if (a == b && b == c) {
            type = "equilateral";
        } else if (a != b && b != c) {
            type = "scalene";
        } else if (a < 1 || b < 1 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Illegal arguments. Value must be greater then zero and sum of any two values must be greater than third value");
        }

        return type;
    }
}
