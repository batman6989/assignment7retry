package org.mathcode;

import static java.lang.System.out;

public class SimpleCal{
    double result;
    public double doMultiplication(double i, double i1) {
        result = i * i1;
        System.out.println("Multiplication of " + i + " and " + i1 + " is ::::::: " + result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println("******* Entering in Multiplication Process ********");
        new SimpleCal().doMultiplication(10,2);
        new SimpleCal().doMultiplication(5,3);
        new SimpleCal().doMultiplication(19,6);
        new SimpleCal().doMultiplication(24,9);
    }
}