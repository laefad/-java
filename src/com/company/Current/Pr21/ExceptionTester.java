package com.company.Current.Pr21;

import java.util.Scanner;

public class ExceptionTester {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        //попытка выполнить находящееся внутри блока try
        try {
            System.out.println(2 / i);
        }
        // при исключении типа ArithmeticException перехватывает ошибку и выполняет блок catch
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        // данный блок всегда выполняется после конструкции try catch
        finally {
            System.err.println("finally block");
        }
    }

    public static void main(String[] args) {
        System.out.println(2.0 / 0.0);// Выводится Infinity, что означает бесконечность или же неопределённость
        ExceptionTester exception = new ExceptionTester();
        exception.exceptionDemo();
    }
}
