class Solution:
    def isPalindrome(self, x: int) -> bool:
        org, rev = x, 0
        while org > 0:
            rev = rev * 10 + org % 10
            org //=10

        if x<0:
            return False
        elif x == rev:
            return True
        else:
            return False
        