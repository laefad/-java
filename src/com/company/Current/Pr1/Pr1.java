package com.company.Current.Pr1;

import java.util.Random;
import java.util.Arrays;

public class Pr1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Program1.sumAndPrintArray(arr);

        Program2.generatePrintSortPrintArray(10);

        System.out.println( "0! = " + Program3.getFactorial(0) );
        System.out.println( "10! = " + Program3.getFactorial(10) );

        try {
            System.out.println("-1! = " + Program3.getFactorial(-1));
        } catch (Error e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static class Program1
    {
        private static int sumArray(int[] arr)
        {
            int sum = 0;
            for (int e: arr)
            {
                sum += e;
            }
            return sum;
        }

        public static void sumAndPrintArray(int[] arr)
        {
            System.out.println("Array sum = " + sumArray(arr));
        }
    }

    public static class Program2
    {
        private static int[] generateArray(int length)
        {
            if (length < 1)
                throw new NegativeArraySizeException();

            final Random rand = new Random();
            int[] arr = new int[length];

            int i = 0;
            while (i < length)
                arr[i++] = rand.nextInt();

            return arr;
        }

        private static void printArray(int[] arr)
        {
            System.out.print("Array : ");
            for (int e : arr)
                System.out.print(e + ", ");
            System.out.print('\n');
        }

        public static void generatePrintSortPrintArray(int length)
        {
            int[] arr = generateArray(length);
            printArray(arr);
            Arrays.sort(arr);
            printArray(arr);
        }
    }

    public static class Program3
    {
        public static int getFactorial(int num)
        {
            if (num < 0)
                throw new Error("The factorial of negative number (" + num + ") does not exist");

            int fact = 1;
            int i = 1;

            do
            {
                fact *= i++;
            } while (i <= num);

            return fact;
        }
    }
}