class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = 0
        m = n
        i = 1
        newFlowerbed = flowerbed.copy()
        if newFlowerbed[0] == 0 and len(newFlowerbed) == 1:
            count += 1
            newFlowerbed[0] = 1
        if newFlowerbed[0] == 0 and newFlowerbed[i] == 0:
            count += 1
            newFlowerbed[0] = 1
        
        if newFlowerbed[len(newFlowerbed) - 1] == 0 and newFlowerbed[len(newFlowerbed) - 2] == 0:
            count += 1
            newFlowerbed[len(newFlowerbed) - 1] = 1
        while i < len(newFlowerbed) - 2 and m != 0:
            # print ("i = ", i, " flowerbed = ", flowerbed, "count = ", count)
            if newFlowerbed[i-1] == 0 and newFlowerbed[i+1] == 0 and newFlowerbed[i] == 0:
                # print("entered")
                count +=1
                newFlowerbed[i] = 1
                m -= 1
            i += 1

            
        return True if count >= n else False
        