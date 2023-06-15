public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        int number = 12321;

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }
}
