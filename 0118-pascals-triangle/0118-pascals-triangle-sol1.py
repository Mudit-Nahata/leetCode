class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[] for _ in range(numRows)]
        result[0].append(1)
        if numRows > 1:
            result[1].insert(0, 1)
            result[1].insert(1, 1)
        if numRows > 2:
            for i in range(2,numRows):
                result[i].insert(0, 1)
                result[i].insert(i, 1)
                for j in range(1,i):

                    print("row", i)
                    print("pos", j, "val", (result[i-1][j-1] + result[i-1][j]))
                    result[i].insert(j,(result[i-1][j-1] + result[i-1][j]))

        return result
