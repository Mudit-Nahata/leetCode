class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        result = [[] for _ in range(rowIndex+1)]
        if rowIndex == 0:
            result[0].insert(0, 1)
            return result[rowIndex]
        if rowIndex+1 == 1:
            result[1].insert(0, 1)
            result[1].insert(1, 1)
            return result[rowIndex]
        if rowIndex+1 > 1:
            result[1].insert(0, 1)
            result[1].insert(1, 1)
        if rowIndex+1 > 2:
            for i in range(2,rowIndex+1):
                result[i] = [1 if j == 0 or j == i else result[i-1][j-1] + result[i-1][j] for j in range(0, i+1)]

        return result[rowIndex]