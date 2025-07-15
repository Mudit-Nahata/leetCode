class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[] for _ in range(numRows)]
        result[0].append(1)
        if numRows > 1:
            result[1].insert(0, 1)
            result[1].insert(1, 1)
        if numRows > 2:
            for i in range(2,numRows):
                result[i] = [1 if j == 0 or j == i else result[i-1][j-1] + result[i-1][j] for j in range(0, i+1)]

        return result
