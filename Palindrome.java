public class Palindrome {

    public boolean isPalindrome(String word) {
        char[] CharArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (CharArray[start] != CharArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        if (p.isPalindrome("madam")) {
            System.err.println("The string is palindrome");
        } else {
            System.err.println("The string is not palindrome");

        }
    }

}
