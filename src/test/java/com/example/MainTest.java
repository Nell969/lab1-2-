package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testFizzBuzz() {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                output.append("fizzbuzz");
            } else if (i % 5 == 0) {
                output.append("fizz");
            } else if (i % 7 == 0) {
                output.append("buzz");
            } else {
                output.append(i).append("");
            }
        }
        String result = output.toString();

        assertTrue(result.contains("fizz"));
        assertTrue(result.contains("buzz"));
        assertTrue(result.contains("fizzbuzz"));
    }

    @Test
    public void testReverseString() {
        String str = "make install";
        String reversedStr = new StringBuilder(str).reverse().toString();
        assertEquals("llatsni ekam", reversedStr);
    }

    @Test
    public void testQuadraticRoots() {
        double a = 1, b = -3, c = 2;
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            assertEquals(2.0, root1);
            assertEquals(1.0, root2);
        } else {
            fail("нет вещественных корней");
        }
    }


    @Test
    public void testPalindrome() {
        String palindromeCandidate = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < palindromeCandidate.length() / 2; i++) {
            if (palindromeCandidate.charAt(i) != palindromeCandidate.charAt(palindromeCandidate.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        assertTrue(isPalindrome);
    }
}
