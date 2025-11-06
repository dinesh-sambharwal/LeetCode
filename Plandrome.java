public class Plandrome {
    static boolean isPalindrome(int n){
        int temp = n, palindrome = 0;
        while(temp>0){
            palindrome = palindrome*10+temp%10;
            temp /= 10;
        }
        return palindrome == n;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(11215211));
    }
}