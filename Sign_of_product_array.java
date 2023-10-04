class Solution {
    public int arraySign(int[] nums) {
      int negativecount=0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]==0){
               return 0;
           }
           else if(nums[i]<0){
               negativecount++;
           }
        }
        if(negativecount%2==0){
            return 1;
        }
        else{
            return -1;
        }
        
    
}
s