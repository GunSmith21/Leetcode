class Solution {
    public boolean isPalindrome(int n) {
        int digit;
        int temp = n;
        int rev=0;
        while(n>0){
            digit= n%10;
            n/=10;
            rev = rev*10 + digit;
        }
        return rev==temp;
    }
}