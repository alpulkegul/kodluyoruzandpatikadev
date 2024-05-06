package Fundamentals_plus;

public class Palindrome {
    static boolean isPalindrome(String string) {
        int i = 0;
        int j = 0;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;

            }
            i++;
            j++;
        }
        return true;
    }

    static boolean isPalindrome2(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return string.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2("kavak"));
    }
}
