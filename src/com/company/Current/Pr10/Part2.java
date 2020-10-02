package com.company.Current.Pr10;

public class Part2 {
    public static void main(String[] args) {
        int a = 10, b = 10;
        int totalSum = 0;
        if (a > 0)
            totalSum += recursion(0, a-1, b);
        if (b > 0)
            totalSum += recursion(1, a, b-1);
        System.out.println(totalSum);
    }
    /// da = 0, db = 1
    public static int recursion(int prev, int da, int db)
    {
        if (da == 0 && db == 0)
            return 1;
        if (prev == 0) {
            if (db <= 0)
                return 0;
            else
                return recursion(1, da, db-1);
        } else {
            int sum = 0;
            if (db >= 0)
                sum += recursion(1, da, db-1);
            if (da >= 0)
                sum += recursion(0, da-1, db);
            return sum;
        }
    }

}
