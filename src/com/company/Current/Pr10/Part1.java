package com.company.Current.Pr10;

import java.sql.SQLOutput;

public class Part1 {

    public static void main(String[] args) {
        int k = 32, sum = 9;
        int totalCount = 0;
        for (int i = 1; i < 10; i++)
        {
            totalCount += recursion(k - 1, sum - i);
        }
        System.out.println(totalCount);
    }

    public static int recursion(int dk, int dsum)
    {
        if (dk == 0 && dsum == 0 )
            return 1;
        else if (dk == 0 || dsum < 0)
            return 0;

        int sum = 0;

        for (int i = 0; i < 10; i++)
        {
            sum += recursion(dk - 1, dsum - i);
        }

        return sum;
    }

}
