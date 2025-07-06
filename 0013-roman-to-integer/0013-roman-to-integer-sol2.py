class Solution:
    def romanToInt(self, s: str) -> int:
        pairs = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        # pairCombo = {'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        i = 0
        sum=0
        while i in range(len(s)):

            if i+1<len(s) and pairs[s[i]] < pairs[s[i+1]] :
                sum = sum + (pairs[s[i+1]] - pairs[s[i]])
                i+=2
                
            else:
                sum = sum + pairs[s[i]]
                i+=1
                
        return sum
