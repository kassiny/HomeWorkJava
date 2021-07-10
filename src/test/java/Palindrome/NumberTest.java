package Palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    @Test
    public void oneDigitNumberIsAPalindrome() {
        Number n = new Number();
        Assertions.assertTrue(n.isPalindrome(3));
    }

    @Test
    public void oddPalindromeIsPalindrome() {
        Number n = new Number();
        Assertions.assertTrue(n.isPalindrome(345543));
    }

    @Test
    public void notPalindromeIsNotAPalindrome() {
        Number n = new Number();
        Assertions.assertFalse(n.isPalindrome(456657));
    }

}