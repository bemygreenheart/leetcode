package easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(123455432));
        System.out.println(isPalindrome(76467));
    }

    private static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(temp > 0){
            rev = rev * 10 + temp%10;
            temp = temp / 10;
        }
        return rev == x;
    }

}
