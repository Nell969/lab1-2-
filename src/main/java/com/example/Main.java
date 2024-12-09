package com.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }


        String str = "make install";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);


        double a = 1, b = -3, c = 2;
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни: " + root1 + ", " + root2);
        } else {
            System.out.println("нет вещественных корней");
        }




        String palindromeCandidate = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < palindromeCandidate.length() / 2; i++) {
            if (palindromeCandidate.charAt(i) != palindromeCandidate.charAt(palindromeCandidate.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Является ли строка палиндромом? " + isPalindrome);
    }
}