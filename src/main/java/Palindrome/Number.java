package Palindrome;

public class Number implements Palindrome{
    @Override
    public boolean isPalindrome(int x) {
        int n = Math.abs(x);
        int reverse = 0;
        while (n>0) {
            reverse*=10;
            reverse += n % 10;
            n /= 10;
        }
        return  (reverse==x);
    }

    public static void main(String[] args) {
        int [] mas = {100,133331, 99, 7, 3215};
        Number n = new Number();
        for (int x: mas) {
            System.out.format("the number %d is %s \n", x, (n.isPalindrome(x) ? "a Palindrome" : "not a palindrome"));
        }
    }
}
