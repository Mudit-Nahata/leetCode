class Solution {
    public int jump(int[] nums) {

        if(nums.length==1){
            return 0;
        }
      
      int jumps = jumpCalculator(1,nums[0],1,nums);
      
      return jumps;

        
    }

    int jumpCalculator(int start, int end, int count, int[] nums){
        if(end >=nums.length-1){
            return count;
        }
        int tempStart = end+1;
        int tempEnd = tempStart;
        for(int i = start;i<=end;i++){
          int x = nums[i] + i ;
          if(x>tempEnd){
            tempEnd = x;
          }
          if(x >= nums.length-1){
            return count +1;
          }
        }
        return jumpCalculator(tempStart,tempEnd,count+1,nums);

    }
}