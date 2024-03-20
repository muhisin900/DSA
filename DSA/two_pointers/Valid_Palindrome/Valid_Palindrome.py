class Solution:
    def isPalindrome(self, s: str) -> bool:
        k = "".join(filter(str.isalnum, s))
        k = k.lower()

        return k == k[::-1]
