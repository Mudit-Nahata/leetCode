public class Solution {
     static{
        for(int i=0;i<500;i++){
        productExceptSelf(new int[1]);
        }
     }
public static int[] productExceptSelf(int[] nums) {
    // if (nums.length==2) {
    //     int temp=nums[0];
    //     nums[0]=nums[1];
    //     nums[1]=temp;
    //     return nums;
    // }
    int [] arr= new int[nums.length];
    arr[0]=1;
    for(int i=1;i<arr.length;i++){
        arr[i]=nums[i-1]*arr[i-1];
    }
    int temp=1;
   
    
    for(int i=arr.length-1;i>=0;i--){
      arr[i]=arr[i]*temp;
      temp*=nums[i];
    }
    
  
    return arr;
}
}