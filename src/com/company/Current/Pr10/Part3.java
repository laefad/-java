package com.company.Current.Pr10;

public class Part3 {

    private static int recursion(int n)
    {
        if (n == 0) return 0;
        System.out.print(String.format("%d ",n - recursion(n/10) * 10));
        return n;
    }

    // 1234 -> 123 -> 12 -> 2
    // 1234 - 123 * 10 = 4
    // 123 - 12 * 10 = 3
    // 12 - 1 * 10 = 2
    // 1 - 2 * 0 = 1

    public static void main(String[] args) {
        recursion(123456089);
    }
}
