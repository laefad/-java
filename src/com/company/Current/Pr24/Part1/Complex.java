package com.company.Current.Pr24.Part1;

public class Complex {

    private int natural;
    private int complex;

    Complex (int n, int i) {
        natural = n;
        complex = i;
    }

    public int getNatural() {
        return natural;
    }

    public int getComplex() {
        return complex;
    }

    @Override
    public String toString() {
        return "" + natural + " " + (complex >= 0 ? "+ " + complex : "- " + -complex) + 'i';
    }
}
