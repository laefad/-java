package com.company.Current.Pr24.Part1;

public class ComplexFabric implements NumberFabric<Complex> {

    @Override
    public Complex createNumber(int n, int i) {
        return new Complex(n, i);
    }

    public static void main(String[] args) {
        var fabric = new ComplexFabric();
        System.out.println("complex number = " + fabric.createNumber(10, -1).toString());
        System.out.println("complex number = " + fabric.createNumber(-1, 10).toString());
    }
}
