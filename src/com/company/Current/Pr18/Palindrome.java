package com.company.Current.Pr18;

public class Palindrome {

    public static String isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0)
            return "YES";
        else
            if (s.substring(0, 1).equals(s.substring(s.length() - 1)))
                return isPalindrome(s.substring(1, s.length() - 1));
            else
                return "NO";
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("asdasadsa"));
        System.out.println(isPalindrome("huhu"));
    }
}
