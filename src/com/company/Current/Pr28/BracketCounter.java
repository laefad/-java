package com.company.Current.Pr28;

import java.util.List;

public class BracketCounter {

    public static boolean isBracketsOk(String expression) {

        int amount = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(')
                amount += 1;
            else if (expression.charAt(i) == ')')
                amount -= 1;
            if (amount < 0)
                return false;
        }
        return amount == 0;
    }

    public static void main(String[] args) {
        List.of(
                "(3*+*5)*–*9*×*4",
                "((3*+*5)*–*9*×*4",
                ")))()(",
                "()()((",
                "((()))"
        ).forEach(el -> System.out.println(el + " -> " + isBracketsOk(el)));
    }
}
