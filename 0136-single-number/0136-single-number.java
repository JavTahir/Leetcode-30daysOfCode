class Solution {
    public int singleNumber(int[] nums) {
        int str=00;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=str){
                if(i==nums.length-1){
                    return nums[i];
                }
                else{
                    int count=0;
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[i]==nums[j]){
                            nums[j]=str;
                            count++;
                        }
                    }

                    if(count==0){
                        return nums[i];
                    }
                }
            }
        }
        return 0;
        
    }
}